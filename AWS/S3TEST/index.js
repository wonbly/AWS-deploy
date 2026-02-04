let flowerImages = [
    "https://haileypark.s3.ap-northeast-2.amazonaws.com/images_public/pinktulip.jpg",
    "https://haileypark.s3.ap-northeast-2.amazonaws.com/images_public/watertulip.jpg"
];

localStorage.setItem('flowerList', JSON.stringify(flowerImages));

let getFlowers = JSON.parse(localStorage.getItem('flowerList'));

let displayArea = document.getElementById('flower-display');

if (getFlowers) {
    getFlowers.forEach(url => {
        const imgTag = document.createElement('img');
        imgTag.src = url;
        imgTag.alt = "Flower Image";
        displayArea.appendChild(imgTag);
    });
}