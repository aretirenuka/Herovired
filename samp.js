// Get the canvas element and set its width and height
const canvas = document.getElementById('canvas');
canvas.width = 400;
canvas.height = 400;

// Get the canvas context and set the fill style
const ctx = canvas.getContext('2d');
ctx.fillStyle = '#FF0000';

// Set up the ball object
const ball = {
  x: Math.random() * (canvas.width - 20) + 10, // Random x position
  y: Math.random() * (canvas.height - 20) + 10, // Random y position
  radius: 10, // Ball radius
  speed: 5 // Ball speed
};

// Set up the rectangular area where the ball can move
const area = {
  x: 50,
  y: 50,
  width: canvas.width - 100,
  height: canvas.height - 100
};

// Handle keyboard input
document.addEventListener('keydown', event => {
  if (event.key === 'w' && ball.y > area.y + ball.radius) {
    ball.y -= ball.speed; // Move up
  } else if (event.key === 'a' && ball.x > area.x + ball.radius) {
    ball.x -= ball.speed; // Move left
  } else if (event.key === 's' && ball.y < area.y + area.height - ball.radius) {
    ball.y += ball.speed; // Move down
  } else if (event.key === 'd' && ball.x < area.x + area.width - ball.radius) {
    ball.x += ball.speed; // Move right
  }
});

// Update the canvas
function update() {
  // Clear the canvas
  ctx.clearRect(0, 0, canvas.width, canvas.height);

  // Draw the ball
  ctx.beginPath();
  ctx.arc(ball.x, ball.y, ball.radius, 0, Math.PI * 2);
  ctx.fill();

  // Draw the rectangular area
  ctx.beginPath();
  ctx.rect(area.x, area.y, area.width, area.height);
  ctx.stroke();

  // Request the next frame
  requestAnimationFrame(update);
}

// Start the animation
requestAnimationFrame(update);
