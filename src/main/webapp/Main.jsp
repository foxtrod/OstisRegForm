<%--
  Created by IntelliJ IDEA.
  User: horbachevsky
  Date: 08.11.2016
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="" method="post" id="regdata">

    <h3 align="center" class="ss-form-title">Регистрация участников конференции<br>OSTIS-2017</h3>


    <div class="article" align="">
        <label for="article">
            <div>Название статьи/Article title</div>
        </label>
        <input type="text" name="article" id="article">
        <input type="hidden" name="id" id="id"/>
    </div>
    <%--(article, id)--%>

    <div class="participation_form" align="">

        <div class="">Форма участия в конференции/Participation form</div>

        <input type="radio" name="radios1" value="report">доклад/report<br>
        <input type="radio" name="radios1" value="no report">только публикация/no report<br>

    </div>

    <%--(participation)--%>

    <div class="info_about_speaker">
        <div style="font-size: 25px; font-style: italic">Информация о докладчике/Information about Speaker</div>
        <div>(лицо непосредственно представляющее доклад на конференции)</div>

        <div class="last_name" align="">
            <label class="" for="last_name">
                <div class="">Фамилия/Last name</div>
            </label>
            <input type="text" name="lastName" id="last_name">
        </div>

        <div class="first_name" align="">
            <label class="" for="first_name">
                <div class="">Имя/First name</div>
            </label>
            <input type="text" name="firstName" id="first_name">
        </div>

        <div class="middle_name" align="">
            <label class="" for="middle_name">
                <div class="">Отчество/Middle name</div>
            </label>
            <input type="text" name="middleName" id="middle_name">
        </div>

        <%--(full name)--%>

        <div class="participation_form" align="">

            <div class="">Ученая степень/Academic degree</div>

            <input type="radio" name="radios2" value="no degree">не имею/no degree<br>
            <input type="radio" name="radios2" value="candidate of science">кандидат наук/candidate of science<br>
            <input type="radio" name="radios2" value="doctor of science">доктор наук/doctor of science<br>

        </div>

        <%--(academice degree)--%>

        <div class="participation_form" align="">

            <div class="">Учёное звание/Academic title</div>

            <input type="radio" name="radios3" value="no degree">не имею/no degree<br>
            <input type="radio" name="radios3" value="senior researcher">старший научный сотрудник/senior researcher<br>
            <input type="radio" name="radios3" value="associate professor">доцент/associate professor<br>
            <input type="radio" name="radios3" value="professor">профессор/professor<br>

        </div>

        <%--(academic title)--%>


        <div class="place_of_work" align="">
            <label class="" for="place_of_work">
                <div class="">Место работы/Place of Work</div>
            </label>
            <input type="text" name="placeOfWork" id="place_of_work">
        </div>

        <%--(placeOfWork)--%>

        <div class="position" align="">
            <label class="" for="position">
                <div class="">Должность/Posistion</div>
            </label>
            <input type="text" name="position" id="position">
        </div>

        <%--(position)--%>

        <div class="country" align="">
            <label class="" for="country">
                <div class="">Страна/Country</div>
            </label>
            <input type="text" name="country" id="country">
        </div>

        <%--(country)--%>

        <div class="city" align="">
            <label class="" for="city">
                <div class="">Город/City</div>
            </label>
            <input type="text" name="city" id="city">
        </div>

        <%--(city)--%>

        <div class="email" align="">
            <label class="" for="email">
                <div class="">Email</div>
            </label>
            <input type="text" name="email" id="email">
        </div>

        <%--(email)--%>

        <div class="contact_phone" align="">
            <label class="" for="contact_phone">
                <div class="">Контатный телефон</div>
            </label>
            <input type="text" name="contactPhone" id="contact_phone">
        </div>

        <%--(contactNumber)--%>
    </div>

    <div class="participation_form" align="">

        <div class="">Необходимость сертификата об участии</div>

        <input type="radio" name="radios4" value="yes">необходим сертификат<br>
        <input type="radio" name="radios4" value="no">нет необходимости<br>

    </div>

    <%--(certificate)--%>

    <div class="participation_form" align="">

        <div class="">Необходимость официального приглашения</div>

        <input type="radio" name="radios5" value="yes">необходимо официальное приглашение на конференцию<br>
        <input type="radio" name="radios5" value="no">нет необходимости<br>

    </div>

    <%--(invite)--%>

    <input type="submit">Submit button</input>

</form>
</body>
</html>
