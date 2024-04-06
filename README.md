<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="https://static-00.iconduck.com/assets.00/rabbitmq-icon-484x512-s9lfaapn.png" alt="Logo" width="180" height="180">
  </a>

<h3 align="center">RabbitMQ Orders</h3>

  <p align="center">
    Spring REST application which is to exercise Spring AMQP for sending and receiving messages by producer/consumer architecture.
  </p>
</div>

## Used technologies

* Spring Initializer(Spring 3, Maven, Java 17)
* RabbitMQ(Spring AMQP)
* Docker
* GIT
* Sonar lint

## Hot to use it

* Clone the repository.
   ```sh
   git clone https://github.com/vasilev02/RabbitMQOrders
   ```
* Install Docker on your machine and execute this command. So, when you run this command, Docker will start a RabbitMQ container named "rabbitma" with the management interface accessible on port 15672 of your host machine, and the RabbitMQ messaging service accessible on port 5672.
   ```sh
   docker run -it --rm --name rabbitma -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
   ```
* You will need to have installed Java and Postman to test REST points.
* Start the project and go to http://localhost:15672 to see queues exchangers etc..


## Produce/consume architecture
<img width="1308" alt="Screenshot 2024-04-06 at 17 22 21 copy" src="https://github.com/vasilev02/RabbitMQOrders/assets/59262958/d1a4c476-a254-4adc-b3d6-1f530ac1281e">

## Useful links
* https://www.rabbitmq.com
* https://medium.com/globant/introduction-to-rabbitmq-5af1a58b942e

## Connect with me

[<img align="left" alt="linkedin" width="30px" src="https://cdn.icon-icons.com/icons2/2429/PNG/512/linkedin_logo_icon_147268.png" />][linkedin]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin]: https://www.linkedin.com/in/valentin-vasilev-849a8b1a6/
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/valentin-vasilev-849a8b1a6/
