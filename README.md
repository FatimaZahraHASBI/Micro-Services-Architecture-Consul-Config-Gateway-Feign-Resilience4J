# <p align="center"> Architecture micro-services avec Spring Cloud 
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"></p>
<b>La mise en oeuvre d'une application basée sur 3 micro-services fonctionnels (Customer-service + Order-service + Invetory-service) avec les services : Discovery-service(Consul)+Gateway(Spring cloud gateway)+config-service(Spring cloud config)</b> <br><br>
 ![Screenshot (169)](https://user-images.githubusercontent.com/63150702/199122559-b0a3b889-ffbe-4368-9d08-fbfcff25a5a6.png)
 <br>
## Démonstration
<b>Le lien vers les micro-services : [micro-services](https://github.com/FatimaZahraHASBI/Micro-Services-Architecture-Consul-Config-Gateway-Feign-Resilience4J/tree/master/micro-services) </b><br>
<b>Mon Discovery-service après la création de tous les services et leurs démarrage</b><br><br>
![image](https://user-images.githubusercontent.com/63150702/199824134-3c82f21a-451c-44bc-a437-ce78e6931893.png)
<br><br>
<b>Les captures d'écran suivantes montrent les différents services web à partir la GATEWAY localhost:9999/ :</b>
## Customer-service
![image](https://user-images.githubusercontent.com/63150702/199824547-d3e74c37-2ceb-4216-92db-9c36723bdafc.png) <br>
![image](https://user-images.githubusercontent.com/63150702/199824721-80c3b822-3194-4d64-95e7-eadb133ce96e.png) <br>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
## Inventory-service
![image](https://user-images.githubusercontent.com/63150702/199824949-355c3207-66bc-45a9-9a95-4490dda8e5fd.png) <br>
![image](https://user-images.githubusercontent.com/63150702/199825124-0412a4bb-c710-49a5-a8c6-3d03d8b6d22e.png)
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
## Order-service
![image](https://user-images.githubusercontent.com/63150702/199825355-bb97b9f9-55df-438e-9e20-7a7c537a8f88.png)<br>
![image](https://user-images.githubusercontent.com/63150702/199825395-7c604d5f-4c33-4099-9b02-def10d8ddfdc.png)<br>
![image](https://user-images.githubusercontent.com/63150702/199825463-baf92837-25eb-4d5c-b40f-ec0e53b39366.png)<br>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
## Ce service montre que tout les autres services marchent bien, parce que order-service utilise customer-service et inventory-service
![image](https://user-images.githubusercontent.com/63150702/199825981-a5db5386-3dba-4238-b52e-46a901a8abbf.png)<br>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
## Journalisation de OpenFeign 
![image](https://user-images.githubusercontent.com/63150702/201186491-46d70aa9-4ba0-4787-9f43-49341a8a8d89.png)<br>
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
## Consul config et vault
![image](https://user-images.githubusercontent.com/63150702/201228553-cedd5238-5a43-4657-b61a-1dd7984ce686.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201228601-3d7e47c7-00d0-4316-933d-e332f168fe4e.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201228642-9644ba1e-9273-46dd-942e-ba8b1cbec43f.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201228783-c3478903-01a1-408a-9451-eb98f029fd83.png)
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif">
<br>
## Partie Front end avec Angular
![image](https://user-images.githubusercontent.com/63150702/201487391-41de209f-a0e0-474e-81db-05469dce3c42.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201487546-05454308-dc85-470c-abf5-c8294a7b2079.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201487561-6abeea93-4b32-4a0f-973c-1af458639754.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201487571-c74ebcb8-543b-4068-bc97-7910964bb9e8.png)
<br>
![image](https://user-images.githubusercontent.com/63150702/201487639-2d65b503-8e3b-4e61-8041-b5d3bcbf2919.png)
