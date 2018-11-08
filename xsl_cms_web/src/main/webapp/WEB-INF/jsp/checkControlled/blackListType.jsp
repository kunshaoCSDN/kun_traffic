<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/6
  Time: 下午 17:06
  黑名单类型管理
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
                    <input id="key1" class="mini-combobox" emptyText="请输入用户状态" style="width:150px;" url="../../data/state.txt" onenter="onKeyEnter"/>
                    <a class="mini-button" onclick="search()">查询</a>
                    <span class="separator"></span>
                    <a class="mini-button" onclick="popUp()">统计图</a>
                </td>
            </tr>
        </table>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:100%;height:380px;"
         url="/checkControlled/blackList/type" ajaxOptions="{type:'get', async: true, data: {},
        dataType: 'text', contentType: 'application/json;charset=utf-8'}"
         allowResize="true" pageSize="10"
         allowCellEdit="true" allowCellSelect="true" multiSelect="true"
         editNextOnEnterKey="true" editNextRowCell="true"
    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div id="checked" type="checkcolumn"></div>
            <div name="btId" field="btId"align="center" headerAlign="center"allowSort="true" width="50">ID</div>
            <div field="btName" width="100" allowSort="true" align="center" headerAlign="center">名称
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="100"/>
            </div>
            <div field="btLevel" width="100" allowSort="true" type="comboboxcolumn" align="center" headerAlign="center">级别
                <input property="editor" class="mini-combobox" style="width:100%;" url="../../data/grade.txt"/>
            </div>
            <div name="btState" field="btState" width="100" allowSort="true" type="comboboxcolumn" align="center" headerAlign="center">状态
                <input property="editor" class="mini-combobox" style="width:100%;" url="../../data/state.txt"/>
            </div>
            <div name="btUsecount" field="btUsecount" width="100" allowSort="true" align="center" headerAlign="center">使用次数
                <!-- 添加编辑信息 -->
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200"/>
            </div>
            <div autoShowPopup="true" name="btRemark" field="btRemark" width="100" allowSort="true"
                 align="center" headerAlign="center">备注
            </div>
            <div align="center" headerAlign="center" name="btUpdatetime" field="btUpdatetime" width="100" allowSort="true" dateFormat="yyyy-MM-dd hh:mm:ss">更新时间</div>
        </div>
    </div>
</div>
<script src="../../js/operation.js" type="text/javascript"></script>
</body>
</html>
