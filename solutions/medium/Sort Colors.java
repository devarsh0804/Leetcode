// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

                mid++;
            }     
            else if(nums[mid]==1){
                mid++;
            }  
            else{
                swap(nums,mid,end);
                end--;
            }
            }
        }
    }

