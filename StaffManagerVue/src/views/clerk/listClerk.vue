<template>
    <div class="app-container">
        <!--查询表单-->
        <el-form :inline="true" class="demo-form-inline">
            <el-form-item>
                <el-input v-model="clerkQueryVo.name" placeholder="职工名称" />
            </el-form-item>
            <el-form-item>
                <el-input
                    v-model="clerkQueryVo.position"
                    placeholder="职工职位"
                />
            </el-form-item>
            <el-form-item>
                <el-input
                    v-model="clerkQueryVo.departmentName"
                    placeholder="部门名称"
                />
            </el-form-item>

            <el-button
                type="primary"
                class="iconfont icon-r-find"
                style="font-size: 18px"
                @click="getClerkListPage()"
                >查询</el-button
            >
            <el-button
                type="default"
                class="iconfont icon-r-delete"
                style="font-size: 18px"
                @click="resetData()"
                >清空</el-button
            >
            <el-button
                :loading="downloadLoading"
                style="margin: 0 0 20px 20px; font-size: 18px"
                type="primary"
                class="iconfont icon-r-paper"
                @click="handleDownload"
            >
                下载Excel
            </el-button>
        </el-form>
        <el-table
            :data="list"
            element-loading-text="数据加载中"
            fit
            highlight-current-row
        >
            <el-table-column type="expand">
                <template slot-scope="props">
                    <el-form
                        label-position="left"
                        inline
                        class="demo-table-expand"
                    >
                        <el-form-item label="照片">
                            <el-image
                                style="width: 100px; height: 100px"
                                :src="baseApi + props.row.photo"
                                fit="contain"
                            /> </el-form-item
                        ><br />
                        <el-form-item label="职工名称">
                            <span>{{ props.row.name }}</span>
                        </el-form-item>
                        <br />
                        <el-form-item label="职工性别">
                            <span>{{
                                props.row.sex == 1 ? "男" : "女"
                            }}</span> </el-form-item
                        ><br />
                        <el-form-item label="职工手机号码">
                            <span>{{
                                props.row.phoneNumber
                            }}</span> </el-form-item
                        ><br />
                        <el-form-item label="职工身份证">
                            <span>{{ props.row.idCard }}</span> </el-form-item
                        ><br />
                        <el-form-item label="职工住址">
                            <span>{{ props.row.address }}</span>
                        </el-form-item>
                    </el-form>
                </template>
            </el-table-column>

            <el-table-column label="序号" width="70" align="center">
                <template slot-scope="scope">{{
                    (page - 1) * limit + scope.$index + 1
                }}</template>
            </el-table-column>

            <el-table-column prop="id" sortable label="职工编号" width="200" />
            <el-table-column
                prop="name"
                sortable
                label="职工姓名"
                width="100"
            />
            <el-table-column prop="position" sortable label="职工职位" />
            <el-table-column
                prop="departmentId"
                sortable
                label="职工部门"
                width="100"
            />
            <el-table-column
                label="操作"
                width="300"
                align="center"
                fixed="right"
            >
                <template slot-scope="scope">
                    <router-link :to="'/clerk/updateClerk/' + scope.row.id">
                        <el-button
                            type="primary"
                            class="iconfont icon-r-edit"
                            style="font-size: 18px"
                        >
                            修改</el-button
                        >
                    </router-link>
                    <el-button
                        type="danger"
                        class="iconfont icon-r-delete"
                        style="font-size: 18px"
                        @click="deleteClerkById(scope.row.id)"
                    >
                        职工离职</el-button
                    >
                </template>
            </el-table-column>
        </el-table>
        <!-- 分页 -->
        <el-pagination
            :current-page="page"
            :page-size="limit"
            :total="total"
            style="padding: 30px 0; text-align: center"
            layout="total, prev, pager, next, jumper"
            @current-change="getClerkListPage"
        />
    </div>
</template>

<script>
import clerk from "@/api/clerk";
export default {
    data() {
        return {
            downloadLoading: false,
            list: null, //查询之后接口返回集合
            page: 1, //当前页
            limit: 6, //每页记录数
            total: 0, //总记录数
            clerkQueryVo: {},
            baseApi: process.env.VUE_APP_BASE_API,
        };
    },
    created() {
        //页面渲染之前执行，一般用于调用methods中定义的方法
        this.getClerkListPage();
    },
    methods: {
        handleDownload() {
            this.downloadLoading = true;
            import("@/vendor/Export2Excel").then((excel) => {
                const tHeader = [
                    "编号",
                    "姓名",
                    "照片",
                    "性别",
                    "部门",
                    "职位",
                    "手机号",
                    "身份证号",
                    "住址",
                ];
                const filterVal = [
                    "id",
                    "name",
                    "photo",
                    "sex",
                    "departmentId",
                    "position",
                    "phoneNumber",
                    "idCard",
                    "address",
                ];
                const list = this.list;
                const data = this.formatJson(filterVal, list);
                excel.export_json_to_excel({
                    header: tHeader,
                    data,
                    filename: "职工信息",
                    autoWidth: true,
                    bookType: "xlsx",
                });
                this.downloadLoading = false;
            });
        },
        formatJson(filterVal, jsonData) {
            return jsonData.map((v) =>
                filterVal.map((j) => {
                    if (j === "timestamp") {
                        return parseTime(v[j]);
                    } else {
                        return v[j];
                    }
                })
            );
        },
        resetData() {
            //清空的方法
            //表单数据清空
            this.clerkQueryVo = {};
            //查询所有
            this.getClerkListPage();
        },
        //页面渲染之后执行，一般用于创建具体方法
        //列表方法
        getClerkListPage(page = 1) {
            this.page = page;
            clerk
                .getClerkListPage(this.page, this.limit, this.clerkQueryVo)
                .then((response) => {
                    //请求成功
                    //response接口返回的数据
                    this.list = response.data.clerkList;
                    this.total = response.data.total;
                })
                .catch((error) => {
                    console.log(error);
                });
        },
        resetData() {
            this.getClerkListPage();
        },
        deleteClerkById(id) {
            //删除功能
            this.$confirm("此操作将永久删除该记录, 是否继续?", "提示", {
                confirmButtonText: "确定",
                cancelButtonText: "取消",
                type: "warning",
            }).then(() => {
                clerk
                    .deleteClerkById(id)
                    .then((response) => {
                        //删除成功
                        //提示信息
                        this.$message({
                            type: "success",
                            message: "删除成功!",
                        });
                        //回到列表
                        this.getClerkListPage();
                    })
                    .catch((error) => {
                        //提示信息
                        this.$message({
                            type: "warning",
                            message: "删除失败!",
                        });
                    });
            });
        },
    },
};
</script>

