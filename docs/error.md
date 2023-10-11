# Error handling

Learn how to handle different types of SDK exceptions, including parameter errors, business exceptions where RetCode is
not 0, etc.

```java
try {
    response = client.invoke(request, Response.class);
} catch (ValidatorException e) {
    System.out.println(e.getMessage());
} catch (RetCodeException e) {
    System.out.println(e.getRetCode());
} catch (USpeedoException e) {
    e.printStackTrace();
}
```
