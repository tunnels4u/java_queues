package com.softwaretunnel.queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Author tunnels4u (Anjali) 
 * Queue with the ability to add at end, remove from
 * top and random access in constant time
 **/
public class RandomAccessQueue<E> {

	private List<E> list = new ArrayList<E>();
	private ArrayDeque<E> deQueue = new ArrayDeque<E>();

	public void addLast(E e) {
		deQueue.addLast(e);
		list.add(e);
	}

	public E removeFirst() {
		E e = deQueue.removeFirst();
		shuffleList();
		return e;
	}

	public E get(int index) {
		return (E) list.get(index);
	}

	private void shuffleList() {

		int listSize = list.size();
		if (listSize > 1) {
			list = (List<E>) list.subList(1, listSize);// O(1) time
		} else {
			list.remove(0);
		}
	}

	public int size() {
		return list.size();
	}

}
