<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Facility</name>
   <tag></tag>
   <elementGuidId>0659e4e5-7db1-40d3-91c0-c794f6466e47</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDA5OWYzODU2ZDkwM2I5MDk1NjAyMjciLCJpYXQiOjE2ODU1OTMzMDAsIm5iZiI6MTY4NTU5MzMwMCwianRpIjoiNDNmNzVkNzYtNDY3Ny00NzU2LWFkYTItY2ExYTBhZTg4ZTNhIiwiZXhwIjoxNjg1Njc5NzAwLCJhdWQiOiIxMTVlZmRlMTE3NWY3ZmJjZjdlMjZmYmE3MTFhNDk1MCIsInR5cGUiOiJhY2Nlc3MiLCJmcmVzaCI6ZmFsc2V9.Dr7o7LKtxKGgn197l8TgCApI9xTDm3eeg8jdeTcgPfs</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>29970862-ac87-4331-9086-b5dbf12e5f13</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>PostmanRuntime/7.32.2</value>
      <webElementGuid>386aecbc-7d7f-4e70-bd5f-4a729e9ade6f</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDA5OWYzODU2ZDkwM2I5MDk1NjAyMjciLCJpYXQiOjE2ODU1OTMzMDAsIm5iZiI6MTY4NTU5MzMwMCwianRpIjoiNDNmNzVkNzYtNDY3Ny00NzU2LWFkYTItY2ExYTBhZTg4ZTNhIiwiZXhwIjoxNjg1Njc5NzAwLCJhdWQiOiIxMTVlZmRlMTE3NWY3ZmJjZjdlMjZmYmE3MTFhNDk1MCIsInR5cGUiOiJhY2Nlc3MiLCJmcmVzaCI6ZmFsc2V9.Dr7o7LKtxKGgn197l8TgCApI9xTDm3eeg8jdeTcgPfs</value>
      <webElementGuid>bd30d3d9-4d4c-4122-9567-77d567866a0f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.qa.ims.experionglobal.dev/api/facility/list_facility_type</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
