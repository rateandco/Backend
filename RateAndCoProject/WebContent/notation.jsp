<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
		xmlns:f="http://java.sun.com/jsf/core"
		xmlns:h="http://java.sun.com/jsf/html"
		xmlns:ui="http://java.sun.com/jsf/facelets">
		
<f:view>
	<head>
		<title>Un formulaire d'inscription JSF</title>
	</head>
	<body>
		<h:form>
			<p>
	    	   <h:outputText id="output" value="#{userbean.message}" />
			</p>
			<h4>
				Formulaire JSF d'inscription à la
				<a href="https://www.doranco.fr/candidature/parcours/72">Formation Java chez DORANCO</a>.
			</h4>
			<table>	
				<tr>
					<td>Prénom:</td>
					<td>
						<h:inputText id="prenom" value="#{userbean.prenom}" required="true" />
						<h:message for="prenom" />
					</td>
				</tr>
				<tr>
					<td>Nom:</td>
					<td>
						<h:inputText id="nom" value="#{userbean.nom}" required="true" />
						<h:message for="nom" />
					</td>
				</tr>
				<tr>
					<td>Sexe:</td>
					<td><h:selectOneRadio id="genre" value="#{userbean.genre}" required="true" >
							<f:selectItem itemLabel="Homme" itemValue="homme" />
							<f:selectItem itemLabel="Femme" itemValue="femme" />
						</h:selectOneRadio>
						<h:message for="genre" />
					</td>
				</tr>
				<tr>
					<td>Date de naissance:</td>
					<td>
						<h:inputText id="datenaissance" value="#{userbean.datedenaissance}" required="true"
										requiredMessage=" : Ce champ est obligatoire">
						</h:inputText>
						<h:outputText value=" (mm-dd-yy)" style="color:gray;"></h:outputText>
						<h:message for="datenaissance" />
					</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><h:inputText value="#{userbean.email}" required="true"
							id="email" /> <h:message for="email" /></td>
				</tr>
				<tr>
					<td>Qualité de service:</td>
					<td><h:selectOneMenu value="#{userbean.niveaudeservice}">
							<f:selectItem itemLabel="Basic" itemValue="basic" />
							<f:selectItem itemLabel="Medium" itemValue="medium" />
							<f:selectItem itemLabel="Premium" itemValue="premium" />
						</h:selectOneMenu></td>
				</tr>
			</table>
			<p>
				<h:commandButton value="Inscription" type="submit" action="#{userbean.inscription()}" />
<!-- 				<h:commandButton value="Inscription" type="submit" action="inscriptionOk.xhtml" /> -->
			</p>
		</h:form>
	</body>
</f:view>
</html>
