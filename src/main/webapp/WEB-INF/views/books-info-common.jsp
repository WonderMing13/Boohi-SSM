<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>纸质书信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/js/jquery.jspanel.css"> 
    <link rel="stylesheet" href="assets/vendor/jquery-ui-1.12.1.complete/jquery-ui.min.css">
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
</head>
<body>
<section id="container" >   
      <script type="text/javascript" src="assets/frame/header.js"></script>
      <script type="text/javascript" src="assets/frame/sidebar.js"></script>
      <section id="main-content">
          <section class="wrapper">
            <h3><i class="fa fa-angle-right"></i>纸质书信息 </h3>
              <div class="row mt">
                  <div class="col-md-12">
                    
                      <div class="content-panel">
                          <table class="table table-striped table-advance table-hover">

                            <h4><i class="fa fa-angle-right"></i> 纸质书信息</h4>
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
                                  <th><i class="fa fa-banknote"></i> 标价</th>
                                  <th> 在售数量</th>
                              </tr>
                              </thead>

<!--                             数据显示开始 -->
                            <c:forEach items="${Paperinfo }" var="paper">
                              <tbody>                            
                              <tr>
                                  <td><input type="checkbox" name="d1" value="${paper.id },${paper.bookid },${paper.book.bookname },${paper.book.bookeditor },${paper.book.bookpress },${paper.book.publicationdate },${paper.book.bookisbn },${paper.book.category },${paper.book.imgPath},${paper.bidprice },${paper.onsalenum }"></td>
                                  <td>${paper.id }</td>
                                  <td>${paper.bookid }</a></td>
                                  <td>${paper.book.bookname }</td>
                                  <td>${paper.book.bookeditor }</td>
                                  <td>${paper.book.bookpress }</td>
                                  <td>${paper.book.publicationdate }</td>
                                  <td>${paper.book.bookisbn }</td>
                                  <td>${paper.book.category }</td>
                                  <td>${paper.book.imgPath }</td>
                                  <td>${paper.bidprice }</td>
                                  <td>${paper.onsalenum }</td>                       
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
                        <button type="button" class="btn btn-primary" id="add"><i class="fa fa-star"></i>添加</button>
                        <button type="button" class="btn btn-success" id="update"><i class="fa fa-pencil"></i>修改</button>
                        <button type="button" class="btn btn-danger" id="delete"><i class="fa fa-trash-o"></i>删除</button>

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

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>
        <script src="assets/js/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="assets/js/jquery.jspanel-compiled.js"></script>
        
        <!-- loading jQuery -->
        <script src="assets/vendor/jquery/jquery-3.1.1.min.js"></script> 
        <!-- optional: loading jQuery UI and jQuery UI Touch Punch -->
        <script src="assets/vendor/jquery-ui-1.12.1.complete/jquery-ui.min.js"></script> 
        <script src="assets/js/jquery.ui.touch-punch.min.js"></script> 
        <!-- loading jsPanel javascript -->
        <script src="assets/js/jquery.jspanel-compiled.js"></script>
       
  <script>


      $("button#update").click(function(){
    	  
    	  if($('input[name="d1"]:checked').length > 1){
    		  alert("!");
    		  return;
    	  }
    	  
    	  if($('input[name="d1"]:checked').length == 0){
    		  alert("!");
    		  return;
    	  }
    	  
    	  var ch_value=[];
    	  $('input[name="d1"]:checked').each(function(){ 
			   ch_value.push($(this).val()); 
			   }); 
		  var array=ch_value[0].split(",");
	
      
		  $.jsPanel({
  		    panelSize: {
                             width:  350,
                             height: function() {return $(window).width()/3}
                          },
  		    headerTitle: '修改纸质书信息',
  		    theme:       'success',
  		    show:        'magictime twisterInDown',
  		    content:     "<form class='form-horizontal' action='Paperchange/"+array[0]+"' method='post'>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text1' class='col-sm-2 control-label'>书籍编号</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text1'  name='paperBookid' value='"+array[1]+"' readonly='true'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text2' class='col-sm-2 control-label'>书名</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text2' name='bookname' placeholder='"+array[2]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text3' class='col-sm-2 control-label'>著者</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text3' name='bookeditor' placeholder='"+array[3]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text4' class='col-sm-2 control-label'>出版社</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text4'  name='bookpress' placeholder='"+array[4]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text5' class='col-sm-2 control-label'>出版日期</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text5' name='bookpublicationdate' placeholder='"+array[5]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text6' class='col-sm-2 control-label'>ISBN</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text6' name='bookisbn' placeholder='"+array[6]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text7' class='col-sm-2 control-label'>分类</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text7' name='bookcategory' placeholder='"+array[7]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
		                 "<label for='text8' class='col-sm-2 control-label'>图片</label>"+
		                 "<div class='col-sm-10'>"+
		                 "<input type='text' class='form-control' id='text8' name='imgPath' placeholder='"+array[8]+"'>"+
		                 "</div>"+
		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text9' class='col-sm-2 control-label'>标价</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text9' name='paperBidprice' placeholder='"+array[9]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<label for='text10' class='col-sm-2 control-label'>在售数量</label>"+
  		                 "<div class='col-sm-10'>"+
  		                 "<input type='text' class='form-control' id='text10' name='paperOnsalenum' placeholder='"+array[10]+"'>"+
  		                 "</div>"+
  		                 "</div>"+
  		                 "<div class='form-group'>"+
  		                 "<div class='col-sm-offset-2 col-sm-10'>"+
  		                 "<button type='submit' class='btn btn-default'>确定</button>"+		    	
  		                 "</div>"+
  		                 "</div>"+
  		                 "</form>",
      });
   });
      
      $("button#delete").click(function(){
		   var cc_value=[];

		       $("input[name='d1']:checked").each(function () {
				   cc_value.push($(this).val());
			});  
		       
		    var array=[];
		    var array1=[];
		    for(var i=0;i<cc_value.length;i++){
		    	  var check=cc_value[i].split(",");
		    	  array.push(check[0]);
		    	  array1.push(check[1]);
		      }
		    
		      $.ajax({
		    	  type:'post',
		    	  url:'PaperDele',
		    	  data:{id:array,bookid:array1},
		    	  traditional:true,
		    	  success:function (data) {
		    		  if(data==0){
		    			  window.location.href="Com";
		    		  }	  
		    	  }
 
		      });		    
	   });
      
      
      $("button#add").click(function(){
    	  
    	  $.jsPanel({
    		    panelSize: {
                               width:  350,
                               height: function() {return $(window).width()/3}
                            },
    		    headerTitle: '添加纸质书信息',
    		    theme:       'success',
    		    show:        'magictime twisterInDown',
    		    content:     "<form class='form-horizontal' action='PaperAdd' method='post'>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text1' class='col-sm-2 control-label'>书籍编号</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text1'  name='paperBookid'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text2' class='col-sm-2 control-label'>书名</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text2' name='bookname'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text3' class='col-sm-2 control-label'>著者</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text3' name='bookeditor'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text4' class='col-sm-2 control-label'>出版社</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text4'  name='bookpress'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text5' class='col-sm-2 control-label'>出版日期</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text5' name='bookpublicationdate'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text6' class='col-sm-2 control-label'>ISBN</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text6' name='bookisbn'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text7' class='col-sm-2 control-label'>分类</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text7' name='bookcategory'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text8' class='col-sm-2 control-label'>图片</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text8' name='imgPath'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text9' class='col-sm-2 control-label'>标价</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text9' name='paperBidprice'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<label for='text10' class='col-sm-2 control-label'>在售数量</label>"+
    		                 "<div class='col-sm-10'>"+
    		                 "<input type='text' class='form-control' id='text10' name='paperOnsalenum'>"+
    		                 "</div>"+
    		                 "</div>"+
    		                 "<div class='form-group'>"+
    		                 "<div class='col-sm-offset-2 col-sm-10'>"+
    		                 "<button type='submit' class='btn btn-default'>确定</button>"+		    	
    		                 "</div>"+
    		                 "</div>"+
    		                 "</form>",
        });
      });


  </script>
  
</body>
</html>