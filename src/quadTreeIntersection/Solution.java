package quadTreeIntersection;

public class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {
        return compare(quadTree1, quadTree2);
    }
    public Node compare(Node quadTree1, Node quadTree2) {
    	if(quadTree1.isLeaf == true) {
    		if(quadTree1.val == true) {
    			return quadTree1;
    		}else {
    			return quadTree2;
    		}
    	}else if(quadTree2.isLeaf == true) {
    		if(quadTree2.val == true) {
    			return quadTree2;
    		}else {
    			return quadTree1;
    		}
    	}
    	//合理利用三元表达式可以节省不少代码行数
//    	if(quadTree1.isLeaf) {
//    		return quadTree1.val ? quadTree1 : quadTree2;
//    	}else if(quadTree2.isLeaf) {
//    		return quadTree2.val ? quadTree2 : quadTree1;
//    	}
    	Node tmp = new Node();
    	tmp.bottomLeft = compare(quadTree1.bottomLeft, quadTree2.bottomLeft);
    	tmp.bottomRight = compare(quadTree1.bottomRight, quadTree2.bottomRight);
    	tmp.topLeft = compare(quadTree1.topLeft, quadTree2.topLeft);
    	tmp.topRight = compare(quadTree1.topRight, quadTree2.topRight);
    	if(tmp.bottomLeft.isLeaf && tmp.bottomRight.isLeaf 
    			&& tmp.topLeft.isLeaf && tmp.topRight.isLeaf &&
    			tmp.topLeft.val == tmp.topRight.val && tmp.topLeft.val == tmp.bottomLeft.val && 
    			tmp.bottomLeft.val == tmp.bottomRight.val) {
    		tmp.isLeaf = true;
    		tmp.val = tmp.bottomLeft.val;
    	}
    	return tmp;
    }
}
