# Pharmacy Ordering Project

## Table of Contents
1. [Abstract](#abstract)
2. [Introduction](#introduction)
3. [Methodology](#methodology)
4. [Snapshots](#snapshots)
5. [Result](#result)
6. [Repository Contents](#repository-contents)

---

## Abstract

The Pharmacy Ordering Project is a menu-driven program designed to facilitate drug ordering from a pharmacy. It categorizes drugs into three categories: cosmetics, prescription drugs, and others. Users can add drugs to the pharmacy's inventory, remove drugs, place orders, and retrieve the total sales for the day. The program ensures that the pharmacy does not exceed its capacity when adding new drugs.

## Introduction

The Pharmacy Ordering Project simplifies the process of ordering drugs from a pharmacy by providing a user-friendly menu-driven interface. The program offers the following functionalities:

1. **Add Drug:** Allows users to add new drugs to the pharmacy's inventory. Users need to provide the drug's name, ID, price, category, and available quantity. The program ensures that the pharmacy does not exceed its capacity.

2. **Remove Drug:** Permits users to remove drugs from the pharmacy's inventory by specifying the drug's ID.

3. **Place an Order:** Users can inquire about the availability of a specific drug by entering its ID. The program retrieves the unit price, prints it for the user, and, if necessary, requests a prescription. For cosmetics, a 20% markup is applied (1.2 times the original price).

4. **Get Total Sales for One Day:** At the end of each day, the program calculates the total sales by tracking the quantity and total price of each order.

5. **Exit:** Allows the user to exit the program.

## Methodology

The Pharmacy Ordering Project is organized using two main classes: `Drug` and `Pharmacy`. The `Drug` class represents individual drugs with properties like name, ID, price, category, and quantity. The `Pharmacy` class manages the pharmacy's inventory and sales.

### Snapshots

The program's user interface is divided into several frames for a streamlined user experience. These frames include:
- Welcome screen for entering pharmacy capacity.
- Main menu with options to add drugs, remove drugs, place orders, get total sales, and exit.
- Additional frames for specific functionalities (add drug, remove drug, place an order, get total sales).

### Result

The Pharmacy Ordering Project streamlines drug ordering by categorizing drugs, ensuring capacity limits are maintained, and providing real-time availability and pricing information. Its modular design and user-friendly interface enhance efficiency for both customers and pharmacy staff.

## Repository Contents

The repository contains the following files:

- `addDrug.java`
- `Drug.java`
- `frame1.java`
- `frame2.java`
- `getTotalSales.java`
- `Main.java`
- `Pharmacy.java`
- `placeAnOrder.java`
- `removeDrug.java`
- `addDrug.form`
- `Advanced_Project.iml`
- `frame1.form`
- `frame2.form`
- `getTotalSales.form`
- `placeAnOrder.form`
- `removeDrug.form`
- `Documentation.docx`
- `UML.docx`
