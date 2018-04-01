<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>检索统计</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <style type="text/css">
#canvas{
  position: relative;
}
#show_num{
  position: absolute;
  z-index: 111;
}
.show_num{
  border: 1px solid #bfbfbf;
  background-color: #fff;
  width: 90px;
  height: 24px;
  line-height: 24px;
  text-indent: 5px;
  position: relative;
  z-index: 0;
}
#show_num em{
  position:absolute;
  bottom:-7px;
  left:4px;
  overflow:hidden;
  width:13px;
  height:13px;
  background:#fff;
  border-bottom:1px solid #bfbfbf;
  border-right:1px solid #bfbfbf;
  -webkit-transform:rotate(45deg);
  -moz-transform:rotate(45deg);
  -o-transform:rotate(45deg);
  transform:rotate(45deg);
  z-index: -2;
}

</style>
</head>
<body>
<section id="container" >
  
      <script type="text/javascript" src="assets/frame/header.js"></script>
      <script type="text/javascript" src="assets/frame/sidebar.js"></script>
       <section id="main-content">
         <section class="wrapper site-min-height">
            <canvas id="canvas"></canvas>

            <div id="show_num"></div>

            <script type="text/javascript" src="assets/js/jquery-1.7.1.min.js"></script>
            <script type="text/javascript" src="assets/js/jquery-easy-pie-chart/canvas.js"></script>

            <div style="text-align:center;clear:both">
            <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
            <script src="/follow.js" type="text/javascript"></script>
           </div>
           </section>
     </section>
      

      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
            <script type="text/javascript" src="assets/frame/footer.js"></script>
              <a href="demo.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
  <script>
 


  </script>
</body>
</html>