<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
<c:set var="cp" value="${pageContext.request.contextPath}"/>
  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="${cp}/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${cp}/assets/css/shop-homepage.css" rel="stylesheet">

</head>

<body>

 <%@include file="template/header.jsp" %>
  <!-- Page Content -->
  <div class="container">
  
	<c:if test="${userClickedHome==true}">
		<%@include file="home.jsp" %>
	</c:if>
   <%--  <c:if test="${userClickedAddCat==true}">
		<%@include file="addCategory.jsp" %>
	</c:if> --%>
    
      <c:if test="${userClickedManageProd==true}">
		<%@include file="manageProduct.jsp" %>
	</c:if>

  </div>
  <!-- /.container -->

 <%@include file="template/footer.jsp" %> 

  <!-- Bootstrap core JavaScript -->
  <script src="${cp}/assets/vendor/jquery/jquery.min.js"></script>
  <script src="${cp}/assets/vendor/popper/popper.min.js"></script>
  <script src="${cp}/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
