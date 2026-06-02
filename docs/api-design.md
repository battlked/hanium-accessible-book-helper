# API Design

## GET /api/books

도서 검색 결과를 반환합니다.

```json
[
  {
    "title": "Spring Boot 입문",
    "author": "Example Author",
    "price": 18000,
    "available": true
  }
]
```

## GET /api/books/{id}/guide

선택한 책의 구매 단계 안내 문장을 반환합니다.

```json
{
  "bookId": 1,
  "steps": ["책 정보를 확인합니다.", "구매 버튼을 선택합니다.", "배송 정보를 확인합니다."]
}
```
