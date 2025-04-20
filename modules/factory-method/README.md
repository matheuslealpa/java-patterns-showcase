# Factory Method - Java Design Pattern

## O que é o Factory Method?

O padrão Factory Method define uma interface para criar objetos, mas permite que as subclasses decidam qual classe instanciar. Ele promove o **desacoplamento da lógica de criação** de objetos, facilitando a **extensão do sistema** com novos tipos sem modificar o código existente.

---

## Exemplo: Notificações

Neste módulo, temos os seguintes tipos de notificação implementados:

- `EmailNotification`
- `SmsNotification`
- `PushNotification`

A classe `NotificationFactory` encapsula a lógica de criação com base no tipo solicitado:

```java
Notification notification = NotificationFactory.create(NotificationType.EMAIL);
notification.send("Mensagem de teste");
