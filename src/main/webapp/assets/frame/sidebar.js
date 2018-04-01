var siderbarHtml = [
'<aside>',
'<div id="sidebar"  class="nav-collapse ">',         
// <!-- sidebar menu start-->
  '<ul class="sidebar-menu" id="nav-accordion">',
  // 头像
    '<p class="centered"><a href="profile.html"><img src="assets/img/ui-zac.jpg" class="img-circle" width="60"></a></p>',
  // 管理员姓名      
        '<h5 class="centered">Administrator</h5>',
  
  // 数据统计            	  	
          '<li class="sub-menu">',
            '<a href="Data">',
              '<i class="fa fa-dashboard"></i>',
                  '<span>数据统计</span>',
            '</a>',
          '</li>',        

  // 信息管理
          '<li class="sub-menu">',
            '<a href="javascript:;" >',
              '<i class="fa fa-th"></i>',
                '<span>信息管理</span>',
                '<i style="float:right" class="fa fa-angle-right"></i>',
            '</a>',
            '<ul class="sub">',
              '<li class="active"><a href="Man">用户信息</a></li>',
//                '<li><a  href="responsive_table.html">管理员信息</a></li>',
            '</ul>',
          '</li>',
  
  // 图书档案
          '<li class="sub-menu">',
            '<a href="javascript:;" >',
              '<i class="fa fa-book"></i>',
                '<span>图书档案</span>',
                '<i style="float:right" class="fa fa-angle-right"></i>',
            '</a>',
            '<ul class="sub">',          
              '<li ><a href="Ele">电子书</a></li>',
              '<li ><a href="Com">纸制书</a></li>',
            '</ul>',
          '</li>',

  // 订单信息
          '<li class="sub-menu">',
            '<a href="javascript:;" >',
              '<i class="fa fa-tasks"></i>',
                '<span>订单信息</span>',
                '<i style="float:right" class="fa fa-angle-right"></i>',
            '</a>',
            '<ul class="sub">',
              '<li><a  href="Deal">买卖订单</a></li>',
              '<li><a  href="Rent">租售订单</a></li>',
            '</ul>',
          '</li>',

  // 活动信息
          '<li class="sub-menu">',
            '<a href="javascript:;" >',
              '<i class="fa fa-cogs"></i>',
                '<span>活动信息</span>',
                '<i style="float:right" class="fa fa-angle-right"></i>',
            '</a>',
            '<ul class="sub">',
              '<li><a  href="Act">活动管理</a></li>',
              // '<li><a  href="">历史记录</a></li>',
            '</ul>',                       
          '</li>',

  // 心得交流                
          '<li class="sub-menu">',
            '<a href="Exp" >',
              '<i class="fa fa-desktop"></i>',
                '<span>心得交流</span>',
            '</a>',
          '</li>',            
                  
  // 检索引擎     
          '<li class="sub-menu">',
            '<a href="Search" >',
              '<i class="fa fa-search"></i>',
                '<span>检索引擎</span>',
                
            '</a>',
            // '<ul class="sub">',
            //   '<li><a  href=""></a></li>',
            //   '<li><a  href=""></a></li>',
            // '</ul>',
          '</li>',

  // 数据制图                
          '<li class="sub-menu">',
            '<a href="javascript:;" >',
              '<i class=" fa fa-bar-chart-o"></i>',
                '<span>数据制图</span>',
                '<i style="float:right" class="fa fa-angle-right"></i>',
            '</a>',
            '<ul class="sub">',
              '<li><a  href="Ord">订单统计</a></li>',
              '<li><a  href="Sea">检索统计</a></li>',
            '</ul>',
          '</li>',

// 权限管理                
          '<li class="sub-menu">',
            '<a href="Aut" >',
              '<i class="fa fa-user"></i>',
                '<span>权限管理</span>',
                
            '</a>',
          '</li>',

  // 用户反馈                
          '<li class="sub-menu">',
            '<a href="" >',
              '<i class="fa fa-eye"></i>',
                '<span>用户反馈</span>',
                
            '</a>',
          '</li>',
  '</ul>',
'</div>',
'</aside>'

].join('');

document.write(siderbarHtml);