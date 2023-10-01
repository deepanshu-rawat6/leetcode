class NGindex <K,V> {
    private K key;
    private V value;

    public NGindex(K key,V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Solution {
    public int largestRectangleArea(int[] nums) {
        List<Integer> width = calculateWidth(nums);

        List<Integer> area = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            area.add(i, nums[i] * width.get(i));
        }

        return Collections.max(area);
    }

    public List<Integer> nearestSmallestToRight(int[] nums) {
        Stack<NGindex<Integer,Integer>> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(nums.length);
            } else if (stack.peek().getKey() < nums[i]) {
                list.add(stack.peek().getValue());
            } else if (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                while (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    list.add(nums.length);
                } else {
                    list.add(stack.peek().getValue());
                }
            }

            stack.push(new NGindex<>(nums[i], i));
        }

        Collections.reverse(list);

        return list;
    }

    public List<Integer> nearestSmallestToLeft(int[] nums) {
        Stack<NGindex<Integer,Integer>> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= nums.length - 1; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (stack.peek().getKey() < nums[i]) {
                list.add(stack.peek().getValue());
            } else if (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                while (!stack.isEmpty() && stack.peek().getKey() >= nums[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(stack.peek().getValue());
                }
            }

            stack.push(new NGindex<>(nums[i], i));
        }

        return list;
    }

    public List<Integer> calculateWidth(int[] nums) {
        List<Integer> width = new ArrayList<>();

        List<Integer> right = nearestSmallestToRight(nums);
        List<Integer> left = nearestSmallestToLeft(nums);

        for (int i = 0; i < nums.length; i++) {
            width.add(i,right.get(i) - left.get(i) - 1);
        }

        return width;
    }
}
