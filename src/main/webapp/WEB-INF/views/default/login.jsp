<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Admin Login</title>
<link href="${SITE_URL}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
<link href="${SITE_URL}/resources/css/bootstrap-theme.min.css" type="text/css" rel="stylesheet"/>
<script src="${SITE_URL}/resources/js/jquery.min.js" type="text/javascript"></script>
<script src="${SITE_URL}/resources/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
       <div class="col-md-4 col-md-offset-4">
           <div class="panel panel-default">
           
               <div class="panel-heading">
                
                 <p>${logout}</p>
                 <strong>Log In To KawaDelivery</strong>
               </div>
            </div>
                 <p>${error}</p>
         <div class="panel body">
              <form method="POST" action="${SITE_URL}/default/login" class="form-signin form-horizontal">
                   <div class="form-group">
                        <div class="col-md-12">
                          <div class="input-group input-group-md">
                                <span class="input-group-addon">
                                   <span class="glyphicon glyphicon-user"></span>
                                     </span>
                                <input name="username" type="text" class="form-control" placeholder="username"/>
                            </div>
                          </div>
               <div class="col-md-12">
                    <div class="input-group input-group-md">
                       <span class="input-group-addon">
                           <span class="glyphicon glyphicon-lock"></span>
                       </span>
                       <input name="password" type="password" class="form-control" placeholder="password"/>
                    </div>
                 </div>
               </div>
           
       <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
             <div class="form-group">
                 <div class="col-md-12">
                       <button type="submit" class="btn btn-success btn-block">Login Please
                           <span class="glyphicon gplyphicon-login"></span>
                        </button>
                 </div>
              </div>
            </form>
            </div>
           </div>
   </div>
 </div>
  </body>
</html>