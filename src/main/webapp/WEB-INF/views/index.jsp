<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SYST 双屿 - 双禹盛泰研发中</title>
    <script type="text/javascript" src="../../static/js/common/common/jquery.min.js"></script>
    <style>
        th,td{
            width: 300px;
        }
    </style>
</head>
<body>
<div style="background-color: #D8D9DC;width: 100%; height: 10000px">
    <div style="padding-top: 100px;text-align: center">
        <img src="../../static/image/common/menu_logo_hover.png"/>
        <div style="padding-top: 50px;"><h2 style="letter-spacing: 8px;">产品研发中··· ···</h2></div>
        <div style="padding-top: 50px;"><a href="/page/syst_profile" style="letter-spacing: 10px;font-size: 30px;font-weight: bold;color: blueviolet">★★★点我查看★★★</a>
        </div>
    </div>
    <div style="padding-top: 100px;text-align: center;">
        <form action="" method="get">
            <input type="hidden" id="nowpage" value="1"/>
            <div style="height: 200px;">
            <table border="1" align="center">
                <tr>
                    <th style="font-weight: bolder;font-size: 20px;color: #068104">商品名字</th>
                    <th style="font-weight: bolder;font-size: 20px;color: #068104">数据库</th>
                </tr>
                <tbody id="productdata">
                </tbody>
            </table>
            </div>
            <div>
            <button type="button" onclick="pagechange(1)">上一页</button>
            <button type="button" onclick="pagechange(2)">下一页</button>
            </div>
        </form>
    </div>
</div>
<script>
    $(function () {
        var nowpage = $("#nowpage").val();
        // alert("当前是第 " + nowpage + " 页");
        productList(nowpage);
    })

    function pagechange(id) {
        var nowpage = $("#nowpage").val();

        if (id == 1) {
            if (nowpage == 1) {
                nowpage = 1;
            } else {
                nowpage--;
            }
        } else if (id == 2) {
            nowpage++;
        }
        $("#nowpage").val(nowpage);
        // alert("当前是第 " + nowpage + " 页");
        productList(nowpage);
    }

    function productList(nowpage) {
        $("#productdata").children().remove();
        var html="";
        $.ajax({
            url: "/product/list/" + nowpage,
            type: "get",
            success: function (data) {
                if(data.status==200){
                    for(var i=0;i<data.data.length;i++){
                        html += "<tr><td>"
                        +data.data[i].productName
                        + "</td>"
                        + "<td>"
                            +data.data[i].dbSource + "</td></tr>"
                    }
                    $("#productdata").append(html);
                }

            }

        })
    }

</script>

</body>
</html>