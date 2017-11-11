<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<!-- 省份分析柱状图部件，应该是三个指标的都是这个-->
<html>
<head>
<script src="resources/jquery-3.2.1.min.js"></script>

<script src="resources/require.js"></script>
</head>

<title></title>

<script type="text/javascript">

 
</script>

<style>

</style>


 <body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
   <div id="main" style="height:400px "></div>
    <!-- ECharts单文件引入 -->
    <script src="resources/echarts-all.js"></script>
    <script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    // 显示标题，图例和空的坐标轴

    myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
    var names = [];    //类别数组（实际用来盛放X轴坐标值）
    var nums = [];    //销量数组（实际用来盛放Y坐标值）
    myChart.on('click', function (params) {
      	 
        alert(params.name);   

     });
    $.ajax({
        type: "post",
        async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        url: "${pageContext.request.contextPath}/hello1",    //请求发送到TestServlet处
        dataType: "json",        //返回数据形式为json
        success: function (result) {
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {
                for (var i = 0; i < result.length; i++) {
                    names.push(result[i].prov_name);    //挨个取出类别并填入类别数组
                }
                for (var i = 0; i < result.length; i++) {
                    nums.push(result[i].num);    //挨个取出销量并填入销量数组
                }
                myChart.hideLoading();    //隐藏加载动画
                myChart.setOption({
                    title: {
                        text: '省份加载示例'
                    },
                    tooltip: {
                        show: true
                    },
                    legend: {
                        data: ['省份']
                    },
                    axisLabel: {  
                    	   interval:0,  
                    	   rotate:40  
                    	}  ,
                    	grid: {  
                    		left: '10%',  
                    		bottom:'35%'  
                    		}, 
                    		xAxis: {
                                data: names,
                                "axisLabel":{  
                                    interval: 0  
                                }  
                            },
                            yAxis: {
                            },
                    calculable : true,
                    series: [{
                        name: '省份',
                        type: 'bar',
                        data: nums,
                        clickable : true,
                        markPoint : {
                            data : [
                                {type : 'max', name: '最大值'},
                                {type : 'min', name: '最小值'}
                            ]
                        },
                        markLine : {
                            data : [
                                {type : 'average', name: '平均值'}
                            ]
                        }
                    }]
                });

            }

        },
        error: function (errorMsg) {
            //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();
        }
    })

    </script>
</body>