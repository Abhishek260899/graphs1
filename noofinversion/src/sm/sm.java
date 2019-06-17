import java.util.*;
public class sm {
int mergesort(int arr[],int a) {
	int temp[]=new int[a];
	int p=_mergesort(arr,temp,0,a-1);
	return p;
}
int _mergesort(int a[],int temp[],int l,int r) {
	int mid;
	int countinv=0;
	if(r>l) {
		
	
	mid=(l+r)/2;
	countinv=_mergesort(a,temp,l,mid);
	countinv+=_mergesort(a,temp,mid+1,r);
	countinv+=merge(a,temp,l,mid+1, r);
}
return countinv;
}
int merge(int a[],int temp[],int l,int m,int r) {
    int i=l;
    int j=m;
    int k=l;
    int c=0;
    while(i<=m-1 && j<=r) {
	if(a[i]>a[j]) {
		temp[k++]=a[j++];
		c+=m-i;
	}
	else {
		temp[k++]=a[i++];
	}
	
    }
    
    	while(i<=m-1) {
    		temp[k++]=a[i++];
    }
    	while(j<=r) {
    		temp[k++]=a[j++];
    	}
    	return c;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	sm s=new sm();
	int a=sc.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
	}
	int p=s.mergesort(arr,a);
	System.out.println(p);
}
}
