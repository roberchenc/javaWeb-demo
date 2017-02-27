package com.umis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SbootMysqlDemoApplication {
	
//	@RequestMapping("/register")
//    public String greeting() {
//        return "register";
//    }

	public static void main(String[] args) {
		SpringApplication.run(SbootMysqlDemoApplication.class, args);
	
	}
		
}


/*
/*
	$.fn.serializeObject = function() {
	    	 var o = {};
	    	 var a = this.serializeArray();
	    	 $.each(a, function() {
	    	 if (o[this.name] !== undefined) {
	    	 	if (!o[this.name].push) {
	    	 		o[this.name] = [o[this.name]];
	    		}
	    	 	o[this.name].push(this.value || '');
	    	 } 
	    	 else {
	    	 	o[this.name] = this.value || '';
	    	}
	    	});
	    	 return o;
	    	};
	    	
	    	$(document).ready(function(){  
	    	    jQuery.ajax({  
	    	        type: 'GET',  
	    	        contentType: 'application/json',  
	    	        url: '/adduser',  
	    	        dataType: 'json',  
	    	        success: function(data){  
	    	            if (data && data.status == "0") {  
	    	                $.each(data.data, function(i, item){  
	    	                    $('#info').append("姓名：" + item.name +"，年龄：" +item.age);  
	    	                });  
	    	            }  
	    	        },  
	    	        error: function(){  
	    	            alert("error")  
	    	        }  
	    	    });  
	    	    $("#submit").click(function(){  
	    	        var jsonuserinfo = $.toJSON($('#form').serializeObject());  
	    	        jQuery.ajax({  
	    	            type: 'GET',  
	    	            contentType: 'application/json',  
	    	            url: '/adduser',  
	    	            data: jsonuserinfo,  
	    	            dataType: 'json',  
	    	            success: function(data){  
	    	                alert("新增成功！");  
	    	            },  
	    	            error: function(){  
	    	                alert("error")  
	    	            }  
	    	        });  
	    	    });  
	    	});*/