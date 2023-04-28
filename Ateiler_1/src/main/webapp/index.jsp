<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Inscription</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="vendor/nouislider/nouislider.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="main">

    <div class="container">
        <div class="signup-content">
            <div class="signup-img">
                <img src="images/form-img.jpg" alt="">
                <div class="signup-img-content">
                    <h2>Register now </h2>
                </div>
            </div>
            <div class="signup-form">
                <form  class="register-form" id="register-form" action="Inscription" method="post">
                    <div class="form-row">
                        <div class="form-group">
                            <div class="form-input">
                                <label for="first_name" class="required">Prénom </label>
                                <input type="text" name="prenom" id="first_name" />
                            </div>
                            <div class="form-input">
                                <label for="last_name" class="required">Nom </label>
                                <input type="text" name="nom" id="last_name" />
                            </div>
                            <div class="form-input">
                                <label for="company" class="required">Cin</label>
                                <input type="text" name="cin" id="company" />
                            </div>
                            <div class="form-input">
                                <label for="date_naissance" class="required">Date de Naissance</label>
                                <input type="date" name="date_naissance" id="date_naissance" />
                            </div>
                            <div class="form-input">
                                <label for="email" class="required">Email</label>
                                <input type="text" name="email" id="email" />
                            </div>
                            <div class="form-input">
                                <label for="phone_number" class="required">Phone number</label>
                                <input type="text" name="tel" id="phone_number" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-input">
                                <label for="date_inscription" class="required">Date d'inscription.</label>
                                <input type="date" name="date_inscription" id="date_inscription" />
                            </div>
                            <div class="form-radio">
                                <div class="label-flex">
                                    <label for="cycle">Filier</label>
                                </div>
                                <div class="form-radio-group" id="filier">
                                    <div class="form-radio-item">
                                        <input type="radio" name="filier" id="IID" value="IID" checked>
                                        <label for="IID">IID</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="filier" value="IRIC" id="IRIC">
                                        <label for="IRIC">IRIC</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="filier" value="GI" id="GI">
                                        <label for="GI">GI</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="filier" value="GE" id="GE">
                                        <label for="GE">GE</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="filier" value="GPEE" id="GPEE">
                                        <label for="GPEE">GPEE</label>
                                        <span class="check"></span>
                                    </div>

                                </div>
                            </div>
                            <div class="form-radio">
                                <div class="label-flex">
                                    <label for="cycle">Cycle</label>
                                </div>
                                <div class="form-radio-group" id="cycle">
                                    <div class="form-radio-item">
                                        <input type="radio" name="cycle" id="1-er" value="1-er" checked>
                                        <label for="1-er">1-er</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="cycle" value="2-éme" id="2-éme">
                                        <label for="2-éme">2-éme</label>
                                        <span class="check"></span>
                                    </div>
                                    <div class="form-radio-item">
                                        <input type="radio" name="cycle" value="3-éme" id="3-éme">
                                        <label for="3-éme">3-éme</label>
                                        <span class="check"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-input">
                                <label for="niveau">Niveau</label>
                                <input type="text" name="niveau" id="niveau" />
                            </div>
                            <div class="form-input">
                                <label for="groupe">Groupe</label>
                                <input type="text" name="groupe" id="groupe" />
                            </div>
                            <div class="form-input">
                                <label for="nombre_annees">Nombre des Années</label>
                                <input type="number" name="nombre_annees" id="nombre_annees" />
                            </div>
                        </div>
                    </div>
                    <div class="form-submit">
                        <input type="submit" value="Submit" class="submit" id="submit" name="register" />
                        <input type="submit" value="Reset" class="submit" id="reset" name="register" />
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>

<!-- JS -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/nouislider/nouislider.min.js"></script>
<script src="vendor/wnumb/wNumb.js"></script>
<script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
<script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
<script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>