<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>订单信息</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">>
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
</head>
<body>
  <section id="container" >
      <script type="text/javascript" src="assets/frame/header.js"></script>
      <script type="text/javascript" src="assets/frame/sidebar.js"></script>
      <!--sidebar end-->
      <section id="main-content">
          <section class="wrapper">
              <h3><i class="fa fa-angle-right"></i> 订单信息 </h3>
              <div class="row mt">
                  <div class="col-md-12">

                      <div class="content-panel" >
                          <table class="table table-striped table-advance table-hover">

                              <h4><i class="fa fa-angle-right"></i> 订单管理</h4>
                              <form>
                                  <div style="position: relative ;left:60px;">
                                      <input type="text"  class="form-control" style="width: 20%;display:inline; " placeholder="只有想不到...没有搜不到..."></input>
                                      <button type="button" class="btn btn-theme" ><i class="fa fa-search"></i> 搜索</button>
                                  </div>
                              </form>
                              <hr>
                    
                              <!-- 第一行 -->
                              <thead>
                              <tr>
                                  <th><input type="checkbox" name=""></th>
                                  <th><i class="fa fa-tag"></i> 序号</th>
                                  <th> 订单编号</th>
                                  <th> 书籍编号</th>
                                  <th><i class="fa fa-user"></i> 卖家用户名</th>
                                  <th><i class="fa fa-bookmark"></i> 订单标题</th>
                                  <th> 订单图片</th>
                                  <th> 交易方式</th>
                                  <th> 交易金额</th>
                                  <th> 数量</th>                                                               
                                  <th> 发布时间</th>
                                  <th> 审核时间</th>
                                  <th> 到期时间</th>
                                  <th><i class="fa fa-user"></i> 买家用户名</th>
                                  <th> 买家地址</th>
                                  <th> 支付方式</th>
                                  <th> 数量</th>
                                  <th> 是否支付</th>
                                  <th> 支付时间</th>
                                  <th> 订单价格</th>
                                  <th> 订单评价</th>
                                  <th>审核是否通过</th>
                    
                              </tr>
                              </thead>

<!--                               数据显示开始 -->
                              <c:forEach items="${dealinfo }" var="deal">
                              <tbody>
                              <tr>
                                  <td><input type="checkbox" name=""></td>
                                  <td>${deal.id }</td>
                                  <td>${deal.orderid }</td>
                                  <td>${deal.order.bookid }</td>
                                  <td>${deal.order.sellerid }</td>
                                  <td>${deal.order.ordertitle }</td>
                                  <td>${deal.order.orderimage }</td>
                                  <td>${deal.order.ordercondition }</td>
                                  <td>${deal.dealprice}</td>
                                  <td>${deal.number }</td>
                                  <td>${deal.order.starttime }</td>
                                  <td>${deal.order.checktime }</td>
                                  <td>${deal.order.finishtime }</td>
                                  <td>${deal.buyerid }</td>
                                  <td>${deal.buyeraddress }</td>
                                  <td>${deal.dealway }</td>
                                  <td>${deal.number }</td>
                                  <td>${deal.ispaid }</td>
                                  <td>${deal.paidtime }</td>
                                  <td>${deal.dealprice }</td>
                                  <td>${deal.order.others }</td>
                                  <td>${deal.audit }</td>
                              </tr>
                              </tbody>
                              </c:forEach>
                              </hr>
                          </table>
                          <p align="middle">
                              <span class="badge bg-warning"><a href=""><i class="fa fa-angle-left"></i></a></span>
                              <span class="badge bg-important">1</span>
                              <span class="badge bg-warning"><a href=""><i class="fa fa-angle-right"></i></a></span>
                          </p>
                      </div>

                      <div align="right" class="showback">
                          <button type="button" class="btn btn-primary"><i class="fa fa-search"></i>审核</button>
                          <button type="button" class="btn btn-success"><i class="fa fa-pencil"></i>修改</button>
                          <button type="button" class="btn btn-danger" style=""><i class="fa fa-trash-o"></i>删除</button>

                      </div>
                  </div>

              </div>

          </section>
      </section>
      <!--main content end-->

      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
            <script type="text/javascript" src="assets/frame/footer.js"></script>
              <a href="orders-info.html#" class="go-top">
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