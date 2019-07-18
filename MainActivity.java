onEvent("startButton", "click", function(){
setScreen("gameScreen");
});
onEvent("catImage", "click", function(){
setPosition("catImage", randomNumber(0,300), randomNumber(5, 400), 100, 100);
console.log("ramen cat clicked");
});
onEvent ("ramenPhoto", "click", function(){
  setScreen("loseScreen");
  console.log("background clicked");
});
onEvent("playAgainButton", "click", function(){
setScreen("screen1");
});
