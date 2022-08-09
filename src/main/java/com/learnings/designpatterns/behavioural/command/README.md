###Command - Encapsulate a command request as an object.
*Command pattern is a data driven design pattern

*A request is wrapped under an object as command and passed to invoker object.

*Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

*interface Order acts as a command.

*Stock class acts as a request

*concrete command classes BuyStock and SellStock implementing Order interface which will do actual command processing

*A class Broker is created which acts as an invoker object. It can take and place orders.

*Main, our demo class, will use Broker class to demonstrate command pattern.