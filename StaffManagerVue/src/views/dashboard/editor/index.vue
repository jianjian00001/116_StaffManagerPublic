<!--
 * @Description: 
 * @Author: Rabbiter
 * @Date: 2023-03-16 01:17:25
-->
<template>
    <div>
        <el-row style="padding: 50px">
            <el-col :span="5">
                <img :src="baseApi + avatar" style="width: 150px" />
            </el-col>
            <el-col :span="19" style="font-size: 24px; font-weight: 600">
                欢迎使用职工管理系统，{{ name }}
                <br />
                <br />
                <span style="font-size: 18px">
                    您的权限:
                    <span
                        v-for="item in roles"
                        :key="item"
                        class="pan-info-roles"
                        >{{ item }}</span
                    >
                </span><br><br>
                <el-button type="primary" class="iconfont icon-r-user1"
                    style="font-size: 18px" @click="$router.push('/profile/index')"> 查看个人信息</el-button>
                <el-button type="danger" class="iconfont icon-r-delete"
                    style="font-size: 18px" @click.native="logout"
                    > 退出当前登录</el-button
                >
            </el-col>

            <el-col :span="24">
                <hr />
            </el-col>
        </el-row>
    </div>
</template>

<script>
import { mapGetters } from "vuex";
import PanThumb from "@/components/PanThumb";
import GithubCorner from "@/components/GithubCorner";

export default {
    name: "DashboardEditor",
    components: { PanThumb, GithubCorner },
    data() {
        return {
            emptyGif:
                "https://wpimg.wallstcn.com/0e03b7da-db9e-4819-ba10-9016ddfdaed3",
            value: new Date(),
            baseApi: process.env.VUE_APP_BASE_API,
        };
    },
    computed: {
        ...mapGetters(["name", "avatar", "roles"]),
    },
    methods: {
        async logout() {
            await this.$store.dispatch("user/logout");
            this.$router.push(`/login?redirect=${this.$route.fullPath}`);
        },
    },
};
</script>

<style lang="scss" scoped>
.el-calendar-table .el-calendar-day {
    height: 30px;
}
.emptyGif {
    display: block;
    width: 45%;
    margin: 0 auto;
}

.dashboard-editor-container {
    background-color: #e3e3e3;
    padding: 30px 0 30px 30px;
    .pan-info-roles {
        font-size: 22px;
        font-weight: 700;
        color: #333;
        display: block;
    }
    .info-container {
        position: relative;
        margin-left: 190px;
        .display_name {
            font-size: 32px;
            line-height: 32px;
            color: #212121;
            position: absolute;
            top: 20px;
        }
    }
}
</style>
