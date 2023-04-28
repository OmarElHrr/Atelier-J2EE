<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Iscription</title>
    <!-- Font-->
    <link rel="stylesheet" href="lib/index.css"/>
</head>
<body class="form-v9">
<div class="page-content">
    <div class="form-v9-content" style="background-image: url('lib/x.jpg')">
        <form class="form-detail" action="SubmitServlet"  method="post" >
            <h2>Enregistrez-Vous</h2>
            <div class="form-row-total">
                <div class="form-row">
                    <input type="text" id="nom" name="nom" class="input-text" placeholder="Votre Nom" required>
                </div>
                <div class="form-row">
                    <input type="text" id="prenom" name="prenom" class="input-text" placeholder="Votre Prenom" required>
                </div>
            </div>
            <div class="form-row-total">
                <div class="form-row">
                    <input type="text" id="cin" name="cin" class="input-text" placeholder="Votre CIN" required>
                </div>
                <div class="form-row">
                    <input type="date" id="date_naissance" name="date_naissance" class="input-text" placeholder="Votre Date de Naissance" required >
                </div>
            </div>
            <div class="form-row-total">
                <div class="form-row">
                    <input type="tel" id="tel" name="tel" class="input-text" placeholder="Votre Telephone" required>
                </div>
                <div class="form-row">
                    <input  type="email" id="email" name="email"  class="input-text" placeholder="Votre Email" required >
                </div>
            </div>
            <div class="form-row-last">
                <input type="submit" name="register" class="register" value="Register">
                <input type="reset" name="register" class="register" value="Annuler">
            </div>
        </form>
    </div>
</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>