# HTML-TEST
关于一些自己学习的HTML项目
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<style type="text/css">
    *{margin: 0;padding: 0;list-style: none;}
            #box{margin: 50px;}
            #box li{width: 100px;
            height: 40px;
            line-height: 40px;
            text-align: center;
            background-color: #d8d8d8;
            margin-right: 2px;
            float: left;
            cursor: pointer;}
    #box .active{background: red;}
    #content{clear: both;}
    #content div{width: 404px;height: 200px;border: 1px solid #d8d8d8;display: none;}
  </style>
</head>
<body>
  <div id="box">
    <!--这个ul为选项卡的菜单，提供选择项，并且设置其中一个li为默认样式-->
    <ul>
      <li class="active">新闻</li>
      <li>社会</li>
      <li>科技</li>
      <li>娱乐</li>
    </ul>
    <!--这个div为选项卡的内容，显示不同菜单的不同内容，并且设置其中一个div为可见，其他隐藏-->
    <div id="content">
      <div style="display: block;">新闻</div>
      <div>社会</div>
      <div>科技</div>
      <div>娱乐</div>
    </div>
  </div>
  <script type="text/javascript">
      window.onload=function(){
        var oBox=document.getElementById('box');
        var aLi=oBox.getElementsByTagName('li');
        var oCon=document.getElementById('content');
        var aDiv=oCon.getElementsByTagName('div');
     
        for(var i=0;i<aLi.length;i++){
          aLi[i].index=i;  //为每个li添加对应的索引index
          aLi[i].onclick=function(){  //循环为每个li添加onclick事件
          for(var i=0;i<aLi.length;i++){
            aLi[i].className=''; //循环清空li样式
            aDiv[i].style.display='none'; //循环隐藏所有div
          }
          this.className='active'; //当前点击的元素样式变成active
          aDiv[this.index].style.display='block';  //this.index 获取当前li对应的索引
          }
        }
      }
    </script>
</body>
</html>
