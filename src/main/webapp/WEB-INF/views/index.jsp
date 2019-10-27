<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <head>
        <title>Click</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            $(document).on("click", "#somebutton", function() {
                $.get("/WelcomeController", function(responseText) {
                    $("#somediv").text(responseText);
                });
            });
        </script>
    </head>
<html>
<body>
<button id="somebutton">press here</button>
        <div id="somediv"></div>

</body>
</html>