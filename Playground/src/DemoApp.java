/**
 * Created by sliu on 8/11/2014.
 */
public class DemoApp {

    public static void main(String[] args) {
        // build example tree
        Terms rootTerms = new Terms(0, 0, 0);
        Node<Terms> rootNode = new Node(rootTerms);
        Terms levelOneLeftTerms = new Terms(0, 50, 50);
        Node<Terms> levelOneLeftNode = new Node(levelOneLeftTerms);
        Terms levelOneRightTerms = new Terms(100, 100, 50);
        Node<Terms> levelOneRightNode = new Node(levelOneRightTerms);
        Terms LevelTwoLeftTerms = new Terms(50, 30, 10);
        Node<Terms> LevelTwoLeftNode = new Node(LevelTwoLeftTerms);
        Terms LevelTwoRightTerms = new Terms (15, 15, 5);
        Node<Terms> LevelTwoRightNode = new Node(LevelTwoRightTerms);

        rootNode.addChild(levelOneLeftNode);
        rootNode.addChild(levelOneRightNode);
        levelOneLeftNode.addChild(LevelTwoLeftNode);
        levelOneLeftNode.addChild(LevelTwoRightNode);
    }
}
