let listService = function () {
  //getList start
  function getList(callback, error) {
    console.log('js getList..........');

    $.ajax({
      type: 'get',
      url: '/main',
      dataType: 'json',
      success: function (list, status, xhr) {
        // 상품 목록을 저장할 변수
        const productList = list;

        // 상품 목록을 HTML로 동적으로 생성
        let htmlContent = '';
        if (productList) {
          productList.forEach(function (product) {
            htmlContent += `
                    <div class="product-item">
                      <h2>${product.title}</h2>
                      <p>원가: ${product.beforePrice}</p>
                      <p>할인율: ${product.discount}</p>
                      <p>할인가: ${product.afterPrice}</p>
                    </div>
                  `;
          });
        }
        // 생성된 HTML을 삽입할 DOM 요소가 있다면 삽입
        if (htmlContent) {
          $('#product-list').html(htmlContent);
        }
        // 콜백 함수 호출
        if (callback) {
          callback(list);
        }
      },
      error: function (xhr, status, er) {
        if (error) {
          console.error('상품 정보를 가져오는 데 실패했습니다:', error);
          error(er);
        }
      },
    });
  }
  //getList end

  return {
    getList: getList,
  };
};
