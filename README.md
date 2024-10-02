# Snakee Maya : Wrath of the Feathered Serpent
**Author: He SUN**

## Brief Project Description
*Snakee Maya : Wrath of the Feathered Serpent* is a captivating take on the classic snake game, set in a mysterious world adorned with the rich visual styles of the Maya, Aztec, and Toltec civilizations.

## How to Install and Run the Project
### 1. **Clone the Repository**
Use Git to clone the project to your local machine. Open your terminal and run the following command:
  ```bash
  git clone https://projects.cs.nott.ac.uk/scyhs4/comp2013-sunhe.git
  ```
### 2. **Running the Game**
- Open the project in your preferred IDE (such as IntelliJ IDEA, Eclipse, or NetBeans).
- Run `MainView` using the IDE's built-in JavaFX support. If you prefer using a text editor like Vim, compile and run the project using Maven.

### 3. **Managing Dependencies**
- This project requires [Java 21](https://www.oracle.com/java/technologies/downloads/) and [JavaFX 21](https://jdk.java.net/javafx21/). Ensure you have the compatable Java version installed on your system.
- The project is built with [Maven 3.8.5](https://maven.apache.org/docs/3.8.5/release-notes.html).

## How to Use the Project
- **Start the Game**: Launch Snakee Maya and select 'Start Game' to choose your faction. In each scene, you will play a snake use up, down, left and right arrow keys. Scores will increase as you eat food. The snake dies if it hits the wall or itself.

- **Maya**: Play a Mayan snake compete against an Aztec snake. The speed is normal. There are 2 pairs of portals pyramids in the game, which can be used to teleport the snake to the other side of the map.
- **Aztec**: Play an Aztec snake compete against a Toltec snake. The speed is fast. There are a many warrior characters attacking your snake.
- **Toltec**: PLay a Toltec snake compete against a Mayan snake. The speed is faster. There are 3 fast whirling storms harming your snake and diverting it.
- **Pause/Continue**: Click the 'Pause/Continue' button to pause or resume the game.
- **Home**: Click the 'Home' button to go back home.
- **Hall of Fame**: Click the 'Hall of Fame' button to see the leaderboard of the game. Click on the header to sort by name/score/faction.
- **Theme**: Click the 'Theme' button to switch the theme of the game. There are 2 themes: warm and cold.
- **Music**: Click the 'Music' button to switch the music on or off.

## Credits
- **Graphics**: Original Mayan-themed graphics generated using OpenAI's [DALL·E-2 API](https://openai.com/product#made-for-developers). Image processing (size, temperature and contrast changing) using a python script involving [Willow](https://pypi.org/project/Willow/). Cutout using Meta's [SAM](https://github.com/facebookresearch/segment-anything).
- **Soundtrack**: Original epic music composition generated using Google's [MusicLM](https://google-research.github.io/seanet/musiclm/examples/) based on [this paper](https://arxiv.org/abs/2301.11325). Sound of special tools and collisions from [Pixabay](https://pixabay.com/sound-effects/).
- **Game Engine**: Developed using JavaFX.

## Screenshots

Screenshot 1 - Main Menu:
![Screenshot 1 - Main Menu](./screen-shots/start-game.png)
Screenshot 2 - Choose Faction:
![Screenshot 2 - Choose Faction](./screen-shots/choose-faction.png)
Screenshot 3 - Game Over in Aztec Scene:
![Screenshot 3 - Game Over in Aztec Scene](./screen-shots/game-over-aztec.png)




