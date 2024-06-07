Assume there is a BookShop.
there are Books in it.

Assume those books are in a database.
Assume there is another bookshop which have the same books.

if the second BookShop also tries to get books from the database(fetching) it affects performance.

Prototype design pattern address this issue.

it creates a clone of the books in the first BookShop and gives to the second.