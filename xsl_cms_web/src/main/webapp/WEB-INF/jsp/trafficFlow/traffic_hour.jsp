<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/6
  Time: 下午 16:17
  展示交通流量月报表/柱状图
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>用户展示 </title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link href="../../css/demo.css" rel="stylesheet" type="text/css"/>
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/zh_CN.js" type="text/javascript"></script>
    <script src="../../js/ColumnsMenu.js" type="text/javascript"></script>
</head>
<body>
<div class="mini-fit">
    <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
            <tr>
                <td style="width:100%;">
                </td>
                <td style="white-space:nowrap;">
                    <input id="key" class="mini-datepicker" format="yyyy-MM-dd" emptyText="选择日期" showTodayButton="false" showClearButton="false" style="width:150px;" allowSort="true" onenter="onKeyEnter"/>
                    &nbsp;
                    <input id="key1" class="mini-spinner"  minValue="0" maxValue="23"/>时
                    &nbsp;
                    <input id="key2" class="mini-combobox" emptyText="选择站点" style="width:150px;" url="/trafficFlow/device/place" onenter="onKeyEnter"/>
                    <a class="mini-button" onclick="search()">查询</a>
                    <span class="separator"></span>
                    <a class="mini-button" onclick="popUp()">统计图</a>
                </td>
            </tr>
        </table>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:100%;height:380px;"
         url="/trafficFlow/hour/select" ajaxOptions="{type:'Post', async: true, data: {},
        dataType: 'text', contentType: 'application/json;charset=utf-8'}"
         allowResize="true" pageSize="10"
         allowCellEdit="true" allowCellSelect="true" multiSelect="true"
         editNextOnEnterKey="true" editNextRowCell="true"
    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div name="dPlace" field="dPlace" headerAlign="center"width="150" align="center">检测站点</div>
            <div field="drCarsign" width="100" headerAlign="center" align="center">车牌</div>
            <div field="drIsillegal" width="100" headerAlign="center" align="center">是否违法</div>
            <div name="drTime" field="drTime" width="100" dateFormat="yyyy-MM-dd hh:mm:ss" align="center" headerAlign="center">检测时间</div>
            <div name="drActualSpeed" field="drActualSpeed" width="100" align="center" headerAlign="center">实速(km/h)</div>
            <div name="drLimitSpeed" field="drLimitSpeed" width="100" align="center" headerAlign="center">限速(km/h)</div>
        </div>
    </div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
<script type="text/javascript">
    function popUp(){
        mini.open({
            targetWindow: window,
            url: "/trafficFlow/hour/chart",
            title: "", width: 800, height: 505,
        });
    }
</script>
</body>
</html>
