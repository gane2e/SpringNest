$(function () {
  $.ajax({
    url: '/resources/json/catecory.json',
    dataType: 'json',
    success: function (data) {
      if (data.length > 0) {
        for (let i in data) {
          $('.catecory')
            .eq(i)
            .prepend("<a><img src='" + data[i].url + "' class='icon'></a>");
          $('.catecory')
            .eq(i)
            .append('<span class="catecory-name">' + data[i].name + '</span>');
        }
      }
    },
  });
});

$(function () {
  $.ajax({
    url: '/resources/json/sliderImg.json',
    dataType: 'json',
    success: function (data) {
      if (data.length > 0) {
        for (let i in data) {
          $('.swiper-slide')
            .eq(i)
            .prepend("<a><img src='" + data[i].url + "'/></a>");
        }
      }
    },
  });
});

$(function () {
  $.ajax({
    url: '/resources/json/list-1.json',
    dataType: 'json',
    success: function (data) {
      if (data.length > 0) {
        for (let i in data) {
          $('.jsonImg')
            .eq(i)
            .prepend("<img src='" + data[i].url + "'/>");
          $('.list-name')
            .eq(i)
            .append('<p class="list-title">' + data[i].title + '</p>');
          $('.list-name')
            .eq(i)
            .append('<span>' + data[i].price + '</span>');
        }
      }
    },
  });
});

$(function () {
  $.ajax({
    url: '/resources/json/list-2.json',
    dataType: 'json',
    success: function (data) {
      if (data.length > 0) {
        for (let i in data) {
          $('.jsonImg2')
            .eq(i)
            .prepend("<img src='" + data[i].url + "'/>");
          $('.list-name2')
            .eq(i)
            .append('<p class="list-title">' + data[i].title + '</p>');
          $('.list-name2')
            .eq(i)
            .append(
              '<p class="before-price">' + data[i]['before-price'] + '</p>'
            );
          $('.list-name2')
            .eq(i)
            .append('<span class="discount">' + data[i].discount + '</span>');
          $('.list-name2')
            .eq(i)
            .append(
              '<span class="after-price">' + data[i]['after-price'] + '</span>'
            );
        }
      }
    },
    error: function (jqXHR, textStatus, errorThrown) {
      console.error('Error loading JSON:', textStatus, errorThrown);
    },
  });
});
