Our project's goal was to design and code a game comparable to popular mobile game, Flappy Bird. The application works
the same as the original game as the objective is to control the bird (a rot dot in our game) through the spaces of the
pillars. Each time the user passes the pillar, the user will score one point. For the code, The FlappyBird class
initializes the game window, sets up the bird and columns, and handles user input through mouse clicks and key presses.
It uses a timer to update the game state regularly. The addColumn method adds a pair of columns with a gap for the bird
to pass through. Columns are added either at the start of the game or when the existing columns are about to move
off-screen. The jump method is called when the player clicks the mouse or presses the space bar. It makes the bird jump
by adjusting its vertical motion. The actionPerformed method is the core of the game logic. It updates the positions of
columns, checks for collisions, and manages the game state, including the score and whether the game is over. The
repaint method in the Renderer class is responsible for drawing the game components on the screen. It sets the
background color, draws the bird, columns, ground, and displays relevant messages (e.g., "Game Over" or "Click to
start") based on the game state. The game has basic physics, and the bird's motion is influenced by gravity. The columns
move from right to left, and when a column moves off-screen, a new one is added to maintain a constant challenge for
the player. The game provides visual feedback to the player through colors and messages on the screen. The main method
initializes the game by creating an instance of the FlappyBird class.