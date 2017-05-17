package Finders;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.WhileStmt;

import Iterators.NodeIterator;

public class whileFind {
	
	private File fileToParse;
	private File file;
	
	public whileFind(File file, File fileToParse){
		this.file = file;
		this.fileToParse = fileToParse;
	}
	
	public ArrayList<String> getAllWhiles() throws IOException{
		ArrayList<String> allReturnText = new ArrayList<String>();
		
		try {
            new NodeIterator(new NodeIterator.NodeHandler() {
                @Override
                public boolean handle(Node node) {
                    if (node instanceof WhileStmt) {
                    	String rtext = " [Lines " + node.getBegin().get().line
                                + " - " + node.getEnd().get().line + " ] " + node;
                        System.out.println(rtext);
                        allReturnText.add(rtext);
                        getNestedWhiles(node,allReturnText);
                        return false;
                    } else {
                    	
                        return true;
                    }
                }
            }).explore(JavaParser.parse(this.fileToParse));
            System.out.println(); // empty line
        } catch (IOException e) {
            new RuntimeException(e);
        }
		PrintWriter out = new PrintWriter(new FileWriter(file, true));
		for(int i =0; i < allReturnText.size(); i++){
			out.append(allReturnText.get(i) + '\n');
		}
		out.close();
		
		return allReturnText;
	}
	
	
	public ArrayList<String> getNestedWhiles(Node node,ArrayList<String> aList ){
		
		
			for(int i =0; i< node.getChildNodes().size(); i++){
				if(node.getChildNodes().get(i) instanceof WhileStmt){
					Node newNode = node.getChildNodes().get(i);
					String rtext = " [Lines " + newNode.getBegin().get().line
                            + " - " + newNode.getEnd().get().line + " ] " + newNode;
					System.out.println(rtext);
					aList.add(rtext);
					getNestedWhiles(newNode,aList);
				}
				else{
					Node newNode = node.getChildNodes().get(i);
					getNestedWhiles(newNode,aList);
				}
			}
		
		
		return aList;
	}
	
	
	public File getFile(){
		return this.file;
	}
	
}
