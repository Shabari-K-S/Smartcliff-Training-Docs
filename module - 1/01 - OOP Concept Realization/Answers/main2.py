import streamlit as st

st.title('Self Practice: Object-Oriented Programming Concept Realization')

st.subheader("""
**Take an object “Mobile Phone” and realize the following OOPs concept**
1. **Identify the object and determine the essential attributes and behaviors for the object.**
2. **Realize the concept of class as a blueprint of the mobile phone.**
3. **How is abstraction employed in the mobile phone to facilitate user interaction? What is the abstraction for the following user levels: User, Designer, Engineer, and Servicemen.**
4. **How is encapsulation applied in the mobile?**
5. **Realize the concept of inheritance and the types of inheritance.**
6. **How does the concept of polymorphism enable flexible handling of different interactions?**
7. **Realize association and its types – aggregation and composition.**
""")

st.markdown("""
---
### Answer:
            
#### 1. Object Identification:

**Object:** Mobile Phone

**Attributes:**
- Brand
- Model
- Color
- Screen Size
- Operating System
- Battery Capacity
- Storage Capacity
- Camera Specifications
- Processor
- RAM
- Connectivity (Wi-Fi, Bluetooth, NFC)
- Price

**Behaviors:**
- Make a Call
- Send a Text Message
- Take Photos
- Record Videos
- Play Music
- Access Internet
- Install/Run Applications
- Set Alarms
- GPS Navigation
- Battery Charging
- Screen Display

---
            
#### 2. Class Blueprint:
            
In Object-Oriented Programming (OOP), a class serves as a blueprint for creating objects with similar characteristics and behaviors. In the context of a "Mobile Phone," a class represents a template that defines the structure and behavior of mobile phones in general.

Imagine a "MobilePhone" class that encapsulates attributes such as brand, model, color, storage capacity, and methods like makeCall(), sendTextMessage(), and takePhoto(). This class encapsulates the essential properties and functionalities that all mobile phones share.

For instance, different instances (objects) of the MobilePhone class can have varying brands, models, or colors, but they all inherit the same set of methods to make calls, send messages, and perform other common tasks. Thus, the MobilePhone class serves as a blueprint that guides the creation of individual mobile phone objects while ensuring consistency and reusability in their design and functionality.
            
---

### 
### 
            
#### 3. Abstraction:

**Abstraction** in Java allows users to interact with objects without needing to understand their implementation details. Each user level perceives the phone differently:

- **User:** Interacts with the phone's interface, apps, and functionalities without understanding the underlying code.
- **Designer:** Designs user interfaces, defines user experience (UX), and creates mockups without needing to know the implementation details of phone functionalities.
- **Engineer:** Implements the functionalities of the mobile phone, focusing on coding logic and algorithms without exposing the internal details to higher-level users.
- **Servicemen:** Perform maintenance, troubleshoot issues, and repair the phone without needing to understand the intricacies of software development.

---

#### 4. Encapsulation:

Encapsulation in Java involves bundling the data (attributes) and methods (behaviors) that operate on the data into a single unit or class. It helps in data hiding and only exposes necessary functionalities. In the `MobilePhone` class, encapsulation is achieved by declaring attributes as private and providing public methods to access and modify them.

---
            
#### 5. Inheritance:

Inheritance in Java allows a class (subclass) to inherit properties and methods from another class (superclass). There are different types of inheritance:

- **Single Inheritance:** A subclass inherits from only one superclass.
- **Multilevel Inheritance:** A subclass is derived from another subclass, forming a hierarchy.
- **Hierarchical Inheritance:** Multiple subclasses inherit from the same superclass.

For example, you can have a `SmartPhone` class that inherits from the `MobilePhone` class.

---
            
#### 6. Polymorphism:

Polymorphism in Java allows objects of different classes to be treated as objects of a common superclass. It enables flexible handling of different interactions through method overriding and method overloading. For instance, you can have a `makeCall()` method in both the `MobilePhone` and `SmartPhone` classes, each with its own implementation.

---
            
#### 7. Association:

Association in Java represents relationships between objects. It can be of two types:

- **Aggregation:** It is a "has-a" relationship where one object contains another object, but the contained object can exist independently. For example, a `MobilePhone` has a `Battery` object.
- **Composition:** It is a stronger form of aggregation where the contained object is part of the containing object and cannot exist without it. For instance, a `MobilePhone` has a `Screen` object, and if the phone is destroyed, the screen is also destroyed.

By incorporating these concepts, you can create a robust and well-structured Java program for modeling a mobile phone system.

---
""")