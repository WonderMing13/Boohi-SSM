<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/vendor/jquery-ui-1.12.1.complete/jquery-ui.min.css">  
    <link rel="stylesheet" href="assets/js/jquery.jspanel.css"> 
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
</head>
<body>
<section id="container" >
      <script type="text/javascript" src="assets/frame/header.js"></script>
      <script type="text/javascript" src="assets/frame/sidebar.js"></script>
      <section id="main-content">
          <section class="wrapper">
            <h3><i class="fa fa-angle-right"></i> 信息管理 </h3>
              <div class="row mt">
                  <div class="col-md-12">
                    
                      <div class="content-panel">
                          <table class="table table-striped table-advance table-hover">

                            <h4><i class="fa fa-angle-right"></i> 用户信息</h4>
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
                                  <th><input type="checkbox" ></th>
                                  <th><i class="fa fa-tag"></i> 序号</th>
                                  <th><i class="fa fa-user"></i> 用户名</th>
                                  <th><i class="fa fa-lock"></i> 密码</th>
                                  <th><i class="fa fa-bookmark"></i> 姓名</th>
                                  <th><i class="fa fa-key"></i>学号</th>
                                  <th> 性别</th>
                                  <th> 余额</th>
                                  <th> 电话</th>
                                  <th> 学校</th>
                                  <th> 院系</th>
                                  <th> 专业</th>
                                  <th><i class="fa fa-edit"></i> 住址</th>
                                  <th>邮箱</th>
                              </tr>
                              </thead>
                            
                            <c:forEach items="${userinfo }" var="info">
                            <!-- 数据显示开始 -->
                              <tbody>
                              <tr>
                                  <td><input type="checkbox" name="c1" value="${info.id },${info.userid },${info.userpassword },${info.username },${info.usergender },${info.userwallet },${info.userphone },${info.userschool },${info.userdepartment },${info.usermajor },${info.stdnumber },${info.useraddress },${info.useremail }"></td>
                                  <td>${info.id }</td>
                                  <td>${info.userid }</td>
                                  <td>${info.userpassword }</td>
                                  <td>${info.username }</td>
                                  <td>${info.stdnumber }</td>
                                  <td>${info.usergender }</td>
                                  <td>${info.userwallet }</td>
                                  <td>${info.userphone }</td>
                                  <td>${info.userschool }</td>
                                  <td>${info.userdepartment }</td>
                                  <td>${info.usermajor }</td>    
                                  <td>${info.useraddress }</td>
                                  <td>${info.useremail }</td>
                              </tr>
                            </tbody>
                            </c:forEach>
                            </hr>
                          </table>
<!--                           <p align="middle"> -->
<!--                             <span class="badge bg-warning" id="Left"><i class="fa fa-angle-left"></i></a></span> -->
<!--                             <span class="badge bg-important">1</span> -->
<!--                             <span class="badge bg-warning" id="Right"><i class="fa fa-angle-right"></i></a></span> -->
<!--                           </p> -->
                          <div class="col-md-3 col-md-offset-3">
							<nav aria-label="Page navigation">
							  <ul class="pagination">
							       <c:if test="${pageInfo.hasPreviousPage }">
							     <li>
							      <a href="Man?pn=${pageInfo.pageNum-1 }" aria-label="Previous">
							        <span aria-hidden="true">&laquo;</span>
							      </a>
							    </li>
							       </c:if>
							   
							    <c:forEach items="${pageInfo.navigatepageNums }" var="pageNum">
							       <c:if test="${pageNum == pageInfo.pageNum }">
							          <li class="active"><a href="#">${pageNum }</a></li>
							       </c:if>
							       <c:if test="${pageNum !=pageInfo.pageNum }">
							           <li><a href="Man?pn=${pageNum }">${pageNum }</a></li>
							       </c:if>
							    </c:forEach>
							    
							    <c:if test="${pageInfo.hasNextPage }">
								    <li>
								      <a href="Man?pn=${pageInfo.pageNum+1 }" aria-label="Next">
								        <span aria-hidden="true">&raquo;</span>
								      </a>
								    </li>
							    </c:if>
							    
							  </ul>
							</nav>
						</div>
						
                      </div>

                      <div align="right" class="showback">
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

    <!-- loading jQuery -->
        <script src="assets/vender/jquery/jquery-3.2.1.min.js"></script>
        <!-- OPTIONALLY load jQuery UI and jQuery UI Touch Punch js -->
        <script src="assets/vendor/jquery-ui-1.12.1.complete/jquery-ui.min.js"></script>
        <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
        <!-- loading jsPanel javascript -->
        <script src="assets/js/jquery.jspanel-compiled.js"></script>
    
  <script>
  
     //var ID = document.getElementsByName("c1");
//    $("input[type='checkbox']").click(function () {
// 	   if($("input[name='c1']:checked").length ==1){
// 		   for(var i=0;i<ID.length;i++){
// 			   var dir=" ";
// 			   var dir=ID[i].value;	   
// 		   }
// 		   var array=dir.value.split(",");
// 		   var userid=array[0];
// 		   alert(userid);
           
//            alert(ID);
   
       
    	   
		   $("button#update").click(function () {
			   //修改不允许多条数据
			   if($("input[name='c1']:checked").length > 1 ){			   
				   alert("!");
				   return;
			   }
			   if($("input[name='c1']:checked").length == 0 ){			   
				   alert("!");
				   return;
			   }
			   
			   var chk_value =[]; 
			   $('input[name="c1"]:checked').each(function(){ 
			   chk_value.push($(this).val()); 
			   }); 
			   
			   var array=chk_value[0].split(",");	
			   
		    	  $.jsPanel({
		    		    //paneltype:   'modal',
		    		    panelSize: {
                                       width:  350,
                                       height: function() {return $(window).width()/3}
                                    },
		    		    headerTitle: '修改用户信息',
		    		    theme:       'success',
		    		    show:        'magictime twisterInDown',
		    		    content:     "<form class='form-horizontal' action='Manchange/"+array[0]+"' method='post'>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text1' class='col-sm-2 control-label'>用户名</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text1'  name='userId' value='"+array[1]+"' readonly='true'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text2' class='col-sm-2 control-label'>密码</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text2' name='userPassword' placeholder='"+array[2]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text3' class='col-sm-2 control-label'>姓名</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text3' name='userName' placeholder='"+array[3]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text4' class='col-sm-2 control-label'>学号</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text4'  name='userstNumber' placeholder='"+array[4]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text5' class='col-sm-2 control-label'>性别</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text5' name='userGender' placeholder='"+array[5]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text6' class='col-sm-2 control-label'>余额</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text6' name='userWallet' placeholder='"+array[6]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text7' class='col-sm-2 control-label'>电话</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text7' name='userPhone' placeholder='"+array[7]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text8' class='col-sm-2 control-label'>学校</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text8' name='userSchool' placeholder='"+array[8]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text9' class='col-sm-2 control-label'>院系</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text9' name='userMajor' placeholder='"+array[9]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text10' class='col-sm-2 control-label'>专业</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text10' name='userDepartment' placeholder='"+array[10]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text11' class='col-sm-2 control-label'>住址</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text11' name='userAddress' placeholder='"+array[11]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<label for='text12' class='col-sm-2 control-label'>邮箱</label>"+
		    		                 "<div class='col-sm-10'>"+
		    		                 "<input type='text' class='form-control' id='text12' name='userEmail' placeholder='"+array[12]+"'>"+
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "<div class='form-group'>"+
		    		                 "<div class='col-sm-offset-2 col-sm-10'>"+
		    		                 "<button type='submit' class='btn btn-default'>确定</button>"+		    	
		    		                 "</div>"+
		    		                 "</div>"+
		    		                 "</form>",
// 		    		    callback:    function(panel){
// 		    		    	$("button#cc", this.content).click(function()
// 		    		    			{
// 		    		    		        $.jsPanel.close();
// 		    		    		});
// 		    		         }
		    		});
			   
			});
		   
		   $("button#delete").click(function(){
			   var cc_value=[];

			       $("input[name='c1']:checked").each(function () {
					   cc_value.push($(this).val());
				});  
			       
			    var array=[];
			    for(var i=0;i<cc_value.length;i++){
			    	  var check=cc_value[i].split(",");
			    	  array.push(check[0]);
			      }
                 
			      $.ajax({
			    	  type:'post',
			    	  url:'ManDele',
			    	  data:{id:array},
			    	  traditional:true,
			    	  success:function (data) {
			    		  if(data==0){
			    			  window.location.href="Man";
			    		  }	  
			    	  }
	  
			      });
			    
		   });
		   

    	  
  </script>
</body>
</html>