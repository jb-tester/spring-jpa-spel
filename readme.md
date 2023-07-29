###### Test SPEL support in Spring JPA Queries

see [spring jpa documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query.spel-expressions)

_submitted youtrack issues:_

1) SPEL in @Query annotations: '?' is not parsed properly:[IDEA-186558](https://youtrack.jetbrains.com/issue/IDEA-186558) - fixed long time ago, but broken again
2) JPA QL: Spring Security-specific SpEL expressions are not parsed properly:[IDEA-260945](https://youtrack.jetbrains.com/issue/IDEA-260945) - regression, same as (1); fixed
3) SPEL in @Query annotations: index expression is not parsed properly:[~~IDEA-265462~~](https://youtrack.jetbrains.com/issue/IDEA-265462) [IDEA-300505](https://youtrack.jetbrains.com/issue/IDEA-300505)
4) SPEL in @Query annotation: support escaping:[IDEA-265496](https://youtrack.jetbrains.com/issue/IDEA-265496)