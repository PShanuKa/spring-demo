# E-Commerce API — Learning Plan

Style reference: `platform-admin-service` (layered: controller -> service interface -> service impl -> repository).
Each step: I give the spec, you write the code, I review.

## Phase 1 — Category (first full vertical slice)
- [ ] Step 1: packages + `Category` entity + `CategoryRepository` + Category DTOs
- [ ] Step 2: `ApiResponse<T>` wrapper + `CategoryService` interface + `CategoryServiceImpl`
- [ ] Step 3: `CategoryController` (POST/GET/GET{id}/PUT/DELETE) + `@Valid`
- [ ] Step 4: `CustomException` + `StatusCode` enum + `GlobalExceptionHandler`

## Phase 2 — Product
- [ ] Step 5: `Product` entity with `@ManyToOne` Category + repository
- [ ] Step 6: Product service/controller + pagination (`Pageable`, `PagedResponse`)
- [ ] Step 7: Filtering/search (`Specification` or derived queries)

## Phase 3 — Customer & Auth
- [ ] Step 8: `Customer` entity + register endpoint + BCrypt password hashing
- [ ] Step 9: Login endpoint (credential check only, no token yet)
- [ ] Step 10: `TokenService` — JWT generate (access + refresh)
- [ ] Step 11: `BearerTokenValidationFilter` + public paths config + `RequestContext`

## Phase 4 — Orders
- [ ] Step 12: `Cart` / `CartItem`
- [ ] Step 13: `Order` / `OrderItem`, `@Transactional`, stock decrement
- [ ] Step 14: Order status flow + role-based access

## Phase 5 — Production practices
- [ ] Step 15: Unit tests (Mockito) + `@WebMvcTest`
- [ ] Step 16: Flyway migrations instead of `ddl-auto: update`
- [ ] Step 17: Config properties (`@ConfigurationProperties`), profiles, logging
