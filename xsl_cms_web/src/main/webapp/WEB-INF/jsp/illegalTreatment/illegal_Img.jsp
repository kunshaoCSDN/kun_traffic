<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/08
  Time: 下午 12:47
  违法图片浏览处理，点击图片查看，出现一个放大的图片（如果图片不对，可以对图片进行替换）
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
         url="/illegalTreatment/illegalImg/all" ajaxOptions="{type:'get', async: true, data: {},
        dataType: 'text', contentType: 'application/json;charset=utf-8'}"
         allowResize="true" pageSize="10"
         allowCellEdit="true" allowCellSelect="true" multiSelect="true"
         editNextOnEnterKey="true" editNextRowCell="true"
         ondrawcell="draw"
    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div id="checked" type="checkcolumn"></div>
            <div name="dPlace" field="dPlace" align="center" headerAlign="center" allowSort="true" width="150">检测地区</div>
            <div field="drCarsign" width="100" allowSort="true" align="center" headerAlign="center">车牌号</div>
            <div field="icId" width="100" allowSort="true" align="center" headerAlign="center">违法代码</div>
            <div name="icFine" field="icFine" width="100" allowSort="true" align="center" headerAlign="center" >罚款
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200"/>
            </div>
            <div name="icScore" field="icScore" width="100" allowSort="true" align="center" headerAlign="center" >扣分
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200"/>
            </div>
            <%--不用来显示，用来保存图片的地址--%>
            <div autoShowPopup="true" name="irImg" field="irImg" width="0" allowSort="true"
                 align="center" headerAlign="center">图片
            </div>
            <div  align="center" name="approve" field="approve"  headerAlign="center">图片</div>
            <div name="irRemark" field="irRemark" width="100" allowSort="true" align="center" headerAlign="center" >备注
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="100"/>
            </div>
        </div>
    </div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
<script type="text/javascript">

    //为每一行添加 图片放大按钮
    function draw(e) {
        var record = e.record;
        var column = e.column;
        if (column.name == "approve") {
            e.cellHtml = '<div class="mini-button" iconcls="icon-add" onclick="popImg()" style="cursor:pointer;">图片详情</div>'
        }
    }

    function popImg(){
        var row = grid.getSelected();
        var irImg = row.irImg;
        mini.open({
            targetWindow: window,
            url: "",
            title: "", width: 800, height: 505,
        });
    }

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