<template>
    <div class="dashboard-editor-container">
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
                    > </span
                ><br /><br />
                <el-button
                    type="primary"
                    class="iconfont icon-r-user1"
                    style="font-size: 18px"
                    @click="$router.push('/profile/index')"
                >
                    查看个人信息</el-button
                >
                <el-button
                    type="danger"
                    @click.native="logout"
                    class="iconfont icon-r-delete"
                    style="font-size: 18px"
                    > 退出当前登录</el-button
                >
            </el-col>

            <el-col :span="24">
                <hr />
                <panel-group @handleSetLineChartData="handleSetLineChartData" />
            </el-col>
        </el-row>
    </div>
</template>

<script>
import GithubCorner from "@/components/GithubCorner";
import PanelGroup from "./components/PanelGroup";
import LineChart from "./components/LineChart";
import RaddarChart from "./components/RaddarChart";
import PieChart from "./components/PieChart";
import BarChart from "./components/BarChart";
import TodoList from "./components/TodoList";
import BoxCard from "./components/BoxCard";
import { mapGetters } from "vuex";

const lineChartData = {
    newVisitis: {
        expectedData: [100, 120, 161, 134, 105, 160, 165],
        actualData: [120, 82, 91, 154, 162, 140, 145],
    },
    messages: {
        expectedData: [200, 192, 120, 144, 160, 130, 140],
        actualData: [180, 160, 151, 106, 145, 150, 130],
    },
    purchases: {
        expectedData: [80, 100, 121, 104, 105, 90, 100],
        actualData: [120, 90, 100, 138, 142, 130, 130],
    },
    shoppings: {
        expectedData: [130, 140, 141, 142, 145, 150, 160],
        actualData: [120, 82, 91, 154, 162, 140, 130],
    },
};

export default {
    name: "DashboardAdmin",
    components: {
        GithubCorner,
        PanelGroup,
        LineChart,
        RaddarChart,
        PieChart,
        BarChart,
        TodoList,
        BoxCard,
    },
    data() {
        return {
            lineChartData: lineChartData.newVisitis,
            baseApi: process.env.VUE_APP_BASE_API,
        };
    },
    computed: {
        ...mapGetters(["name", "avatar", "roles"]),
    },
    methods: {
        handleSetLineChartData(type) {
            this.lineChartData = lineChartData[type];
        },
    },
};
</script>

<style lang="scss" scoped>
.dashboard-editor-container {
    padding: 32px;
    position: relative;

    .github-corner {
        position: absolute;
        top: 0px;
        border: 0;
        right: 0;
    }

    .chart-wrapper {
        background: #fff;
        padding: 16px 16px 0;
        margin-bottom: 32px;
    }
}

@media (max-width: 1024px) {
    .chart-wrapper {
        padding: 8px;
    }
}
</style>
