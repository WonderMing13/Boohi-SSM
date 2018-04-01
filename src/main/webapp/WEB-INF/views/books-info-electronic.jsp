<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电子书信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
</head>
<body>
<section id="container" > 
      <script type="text/javascript" src="assets/frame/header.js"></script>
      <script type="text/javascript" src="assets/frame/sidebar.js"></script>
            <section id="main-content">
          <section class="wrapper">
            <h3><i class="fa fa-angle-right"></i> 图书档案 </h3>
              <div class="row mt">
                  <div class="col-md-12">
                    
                      <div class="content-panel">
                          <table class="table table-striped table-advance table-hover">

                            <h4><i class="fa fa-angle-right"></i> 电子书信息</h4>
                              <form>
                                <div >
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
                                  <th><i class="fa fa-user"></i> 书籍编号</th>
                                  <th><i class="fa fa-bookmark"></i> 书名</th>
                                  <th><i class="fa fa-bookmark"></i> 著者</th>
                                  <th><i class="fa fa-shop"></i>出版社</th>
                                  <th><i class="fa fa-calendar"></i> 出版日期</th>
                                  <th><i class="fa fa-key"></i> ISBN</th>
                                  <th> 分类</th>
                                  <th>图片</th>
                                  <th> 下载权限</th>
                                  <th> 下载积分</th>
                                  <th>下载数量</th>
                              </tr>
                              </thead>

<!--                             数据显示开始 -->
                            <c:forEach items="${Eleinfo }" var="electronic">
                              <tbody>
                              <tr>
                                  <td><input type="checkbox" name=""></td>
                                  <td>${electronic.id }</td>
                                  <td>${electronic.book.bookid }</td>
                                  <td>${electronic.book.bookname }</td>                                 
                                  <td>${electronic.book.bookeditor }</td>
                                  <td>${electronic.book.bookpress }</td>
                                  <td>${electronic.book.publicationdate }</td>
                                  <td>${electronic.book.bookisbn }</td>
                                  <td>${electronic.book.category }</td>
                                  <td>${electronic.book.imgPath }</td>
                                  <td>${electronic.dllimits }</td>
                                  <td>${electronic.dlcredits }</td>
                                  <td>${electronic.dlnum }</td>
                                 
                              </tr>
                              
<!--                               数据显示结束 -->
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
                        <button type="button" class="btn btn-primary"><i class="fa fa-star"></i>添加</button>
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
              <a href="demo.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

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