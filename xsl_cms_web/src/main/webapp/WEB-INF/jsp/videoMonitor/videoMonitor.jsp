<%--
  Created by IntelliJ IDEA.
  User: 王坤
  Date: 2018/10/13
  Time: 下午 21:16
  Function : 监控车辆
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <head>
        <title>HTML5 GetUserMedia Demo</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <link rel="stylesheet" type="text/css" href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
        <script src="../../js/jquery.min.js"></script>
        <script type="text/javascript" src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    </head>
<body>
    <div class="row">
        <div class="col-md-6">
            <button type="button" title="开启摄像头" value="开启摄像头" onclick="getMedia();" class="btn btn-success">开启摄像</button>
            <button type="button" class="btn btn-danger">关闭摄像</button>
            <div style="border: 7px solid #1b6d85;width: 574px;height: 434px">
                <video height="420px" autoplay="autoplay" muted="muted"></video>
            </div>
        </div>
        <div class="col-md-6">
            <button type="button" title="拍照" value="拍照" onclick="getPhoto();" class="btn btn-info">拍照</button>
            <br />
            <canvas id="canvas1" height="200px" ></canvas>
        </div>
    </div>
<script type="text/javascript">
    var video = document.querySelector('video');
    var audio, audioType;

    var canvas1 = document.getElementById('canvas1');
    var context1 = canvas1.getContext('2d');

    navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia;
    window.URL = window.URL || window.webkitURL || window.mozURL || window.msURL;

    var exArray = []; //存储设备源ID
    MediaStreamTrack.getSources(function (sourceInfos) {
        for (var i = 0; i != sourceInfos.length; ++i) {
            var sourceInfo = sourceInfos[i];
            //这里会遍历audio,video，所以要加以区分
            if (sourceInfo.kind === 'video') {
                exArray.push(sourceInfo.id);
            }
        }
    });

    function getMedia() {
        if (navigator.getUserMedia) {
            navigator.getUserMedia({
                'video': {
                    'optional': [{
                        'sourceId': exArray[1] //0为前置摄像头，1为后置
                    }]
                },
                'audio':true
            }, successFunc, errorFunc);    //success是获取成功的回调函数
        }
        else {
            alert('Native device media streaming (getUserMedia) not supported in this browser.');
        }
    }

    function successFunc(stream) {
        if (video.mozSrcObject !== undefined) {
            //Firefox中，video.mozSrcObject最初为null，而不是未定义的，我们可以靠这个来检测Firefox的支持
            video.mozSrcObject = stream;
        }
        else {
            video.src = window.URL && window.URL.createObjectURL(stream) || stream;
        }

        video.play();

    }
    function errorFunc(e) {
        alert('Error！'+e);
    }


    // 将视频帧绘制到Canvas对象上,Canvas每60ms切换帧，形成肉眼视频效果
    function drawVideoAtCanvas(video,context) {
        window.setInterval(function () {
            context.drawImage(video, 0, 0,100,150);
        }, 60);
    }

    //拍照
    function getPhoto() {
        context1.drawImage(video, 0, 0,300,200); //将video对象内指定的区域捕捉绘制到画布上指定的区域，实现拍照。
    }
</script>
</body>