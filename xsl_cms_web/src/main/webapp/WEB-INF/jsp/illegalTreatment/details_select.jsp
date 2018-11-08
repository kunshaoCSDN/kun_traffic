<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/08
  Time: 下午 12:59
  Function : 明细查询，对违法的车辆进行更加详细的查询（更加清楚的了解所有违法的车辆的信息）
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>用户展示 </title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link href="../../css/demo.css" rel="stylesheet" type="text/css"/>
    <script src="../../js/boot.js" type="text/javascript"></script>
    <script src="../../js/miniui/locale/en_US.js" type="text/javascript"></script>
    <script src="../../js/ColumnsMenu.js" type="text/javascript"></script>

</head>
<body>
<div class="mini-fit">
    <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
            <tr>
                <td style="width:100%;">
                    <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" tooltip="增加...">增加</a>
                    <a class="mini-button" iconCls="icon-remove" onclick="removeRow('/user/show/delete')" plain="true">删除</a>
                    <span class="separator"></span>
                    <a class="mini-button" iconCls="icon-save" onclick="saveData('/user/show')" plain="true">保存</a>
                </td>
                <td style="white-space:nowrap;">
                    <input id="key" class="mini-textbox" emptyText="请输入用户ID" style="width:150px;" onenter="onKeyEnter"/>
                    <input id="key1" class="mini-textbox" emptyText="请输入用户ID" style="width:150px;" onenter="onKeyEnter"/>
                    <input id="key2" class="mini-combobox" emptyText="请输入用户状态" style="width:150px;" url="../../data/state.txt" onenter="onKeyEnter"/>
                    <a class="mini-button" onclick="search()">查询</a>
                </td>
            </tr>
        </table>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:100%;height:380px;"
         url="/illegalTreatment/details/all" ajaxOptions="{type:'get', async: true, data: {},
        dataType: 'text', contentType: 'application/json;charset=utf-8'}"
         allowResize="true" pageSize="10"
         allowCellEdit="true" allowCellSelect="true" multiSelect="true"
         editNextOnEnterKey="true" editNextRowCell="true"

    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div id="checked" type="checkcolumn"></div>
            <div name="dPlace" field="dPlace" align="center" headerAlign="center" allowSort="true" width="150">检测区域</div>
            <div field="drWay" width="50" align="center" headerAlign="center" allowSort="true">检测信道</div>
            <div field="drCarsign" width="100" align="center" headerAlign="center" allowSort="true" >车牌号</div>
            <div name="icId" align="center" headerAlign="center" field="icId" width="50" allowSort="true" >违法代码</div>
            <div name="icFine" align="center" headerAlign="center" field="icFine" width="50" allowSort="true" >罚款</div>
            <div name="icScore" field="icScore" width="50" align="center" headerAlign="center">扣分</div>
            <div name="drActualSpeed" align="center" headerAlign="center" field="drActualSpeed" width="100" allowSort="true" >实速</div>
            <div name="drLimitSpeed" align="center" headerAlign="center" field="drLimitSpeed" width="100" allowSort="true" >限速</div>
            <div name="irImg" align="center" headerAlign="center" field="irImg" width="100" allowSort="true" >图片</div>
            <div field="drTime" width="100" align="center" headerAlign="center" allowSort="true" valueType="String" dateFormat="yyyy-MM-dd hh:mm:ss">检测时间</div>
        </div>
    </div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
<script type="text/javascript">
    function popUp(){
        mini.open({
            targetWindow: window,
            url: "/TrafficFlowMapper/month/chart",
            title: "", width: 800, height: 505,
        });
    }
</script>
</body>
</html>
