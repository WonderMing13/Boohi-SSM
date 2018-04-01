var headerHtml = [
	'<header class="header black-bg">',
        '<div class="sidebar-toggle-box">',
        '<div class="fa fa-bars tooltips" data-placement="right"></div>',
        '</div>',
    // logo
        '<a href="index.html" class="logo"><b>BOOK HI</b></a>',
    // 注销 and 修改密码
        '<div class="top-menu">',
            '<ul class="nav pull-right top-menu">',
                '<li><a class="logout" href="login.html">注销</a></li>',
                '<li><a class="logout" href="">修改密码</a></li>',
            '</ul>',
        '</div>',
    '</header>'
].join('');

document.write(headerHtml);