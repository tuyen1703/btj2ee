<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    errorPage="../error.html"
    import="pxu.edu.vn.bt1.ProductModel"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! 
		public ArrayList<ProductModel> getProducts() {
		ArrayList<ProductModel> results = new ArrayList();
		results.add(new ProductModel(1, "Shampoo"));
		results.add(new ProductModel(2, "Bread"));
		return results;
	}
	%>
	
	<%
		ArrayList<ProductModel> dssp = getProducts();
		for (ProductModel itr: dssp) {
			out.print(itr.getIdProduct() + "; " + itr.getNameProduct());
		}
	%>
	
	<table>
	  <thead>
		  <tr>
		    <th>ID</th>
		    <th>Ten SP</th>
		</tr>
	  </thead>
	  <tbody>
	  <%
	  	for (ProductModel itr: dssp) {
	  	
	  %>
	  <tr>
	    <td><% out.print(itr.getIdProduct()); %></td>
	    <td><% out.print(itr.getNameProduct()); %></td>
	  </tr>
	    <% } %>
	    </tbody>
	</table>
	
</body>
</html>