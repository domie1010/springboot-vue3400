// JavaScript Document

//主页banner图
function banner(){	
	var bn_id = 0;
	var bn_id2= 1;
	var speed33=5000;
	var qhjg = 1;
    var MyMar33;
	$("#banner .d1").hide();
	$("#banner .d1").eq(0).fadeIn("slow");
	if($("#banner .d1").length>1)
	{
		$("#banner_id li").eq(0).addClass("nuw");
		function Marquee33(){
			bn_id2 = bn_id+1;
			if(bn_id2>$("#banner .d1").length-1)
			{
				bn_id2 = 0;
			}
			$("#banner .d1").eq(bn_id).css("z-index","2");
			$("#banner .d1").eq(bn_id2).css("z-index","1");
			$("#banner .d1").eq(bn_id2).show();
			$("#banner .d1").eq(bn_id).fadeOut("slow");
			$("#banner_id li").removeClass("nuw");
			$("#banner_id li").eq(bn_id2).addClass("nuw");
			bn_id=bn_id2;
		};
	
		MyMar33=setInterval(Marquee33,speed33);
		
		$("#banner_id li").click(function(){
			var bn_id3 = $("#banner_id li").index(this);
			if(bn_id3!=bn_id&&qhjg==1)
			{
				qhjg = 0;
				$("#banner .d1").eq(bn_id).css("z-index","2");
				$("#banner .d1").eq(bn_id3).css("z-index","1");
				$("#banner .d1").eq(bn_id3).show();
				$("#banner .d1").eq(bn_id).fadeOut("slow",function(){qhjg = 1;});
				$("#banner_id li").removeClass("nuw");
				$("#banner_id li").eq(bn_id3).addClass("nuw");
				bn_id=bn_id3;
			}
		})
		$("#banner_id").hover(
			function(){
				clearInterval(MyMar33);
			}
			,
			function(){
				MyMar33=setInterval(Marquee33,speed33);
			}
		)	
	}
	else
	{
		$("#banner_id").hide();
	}
}


//公司简介鼠标已过去变换图片
$(document).ready(function() {
    var $jjico=$(".gsjj-left ul li img");
	$jjico.mouseover(function(){
	var $oldsrc=$(this).attr("src");
	var $newsrc=$oldsrc.substring(0,$oldsrc.length-5)+".gif";
	$(this).attr("src",$newsrc);
	}).mouseout(function(){
		var addstr=$(this).attr("src").substr(12,13);
		var newstr2=$(this).attr("src").substring(0,$(this).attr("src").length-4)+addstr;
		$(this).attr("src",newstr2);
	});
});


//控制养生最后一项的margin值为0
$(document).ready(function() {
    $(".ysbnt ul li:last").css("margin-right","0px");
});

//控制养生按钮鼠标移动上去或者点击时的状态
$(document).ready(function() {
    $(".ysbnt ul li").click(function(){
		$(this).css("background","url(./qtimages/index_22.gif)").siblings().css("background","url(./qtimages/index_23.png)");
		var ysindex=$(this).index();
		var nowcontent=$(".ys-content")[ysindex];
		$(nowcontent).show().siblings(".ys-content").hide();
	});
});

$(document).ready(function() {
    $($(".p-list ul li")[0]).css("margin-left","0px");
	$($(".p-list ul li")[2]).css("margin-right","0px");
	$($(".p-list ul li")[3]).css("margin-left","0px")
	$($(".p-list ul li")[5]).css("margin-right","0px")
});

$(document).ready(function() {
    $($(".zzjd ul li")[2]).css("margin-right","0px");
	$($(".zzjd ul li")[5]).css("margin-right","0px");
});



$(document).ready(function() {
    var $n_li=$(".f_page ul li a");
	$n_li.click(function(){
		$(this).addClass("f_li_bg").parent().siblings().find("a").removeClass("f_li_bg");
	})
});