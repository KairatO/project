<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<body>
<script type='text/javascript'>
$.get(
  "/WelcomeController",
  {
    param1: "param1",

  },
  onAjaxSuccess
);

function onAjaxSuccess(data)
{
  alert(data);
}
</script>
<h1>${msg}</h1>
<h2>Today is <fmt:formatDate value="${today}" pattern="yyy-MM-dd" /></h2>
</body>
</html>