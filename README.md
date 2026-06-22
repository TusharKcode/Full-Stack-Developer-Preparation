# Full Stack Development Preparation

Welcome to the Full Stack Development Preparation repository! This repository serves as a comprehensive collection of resources, code snippets, and conceptual guides covering various aspects of computer science, programming languages, networking, database systems, and full-stack web development.

## 📂 Repository Structure

Here is an overview of the directories and their contents:

### 🤖 AI (Artificial Intelligence)
*(Currently empty - planned for future content related to Artificial Intelligence, Machine Learning, and Deep Learning.)*

### ⚙️ Backend
*(Currently empty - planned for server-side technologies, APIs, and server frameworks.)*

### ☁️ Cloud
*(Currently empty - planned for cloud computing platforms like AWS/GCP, Docker, and deployment strategies.)*

### 💻 Computer
Contains fundamental concepts regarding computer systems, file systems, and web architecture.
- `Basics-of-Computer.txt` — Core hardware and software operational concepts.
- `File-System.txt` — Disk structures, file organisation, and directory structures.
- `ISP.txt` — How Internet Service Providers route and manage traffic.
- `Web-Browser.txt` — Core workings of web browsers, rendering engines, and parsing.

### 📊 DSA (Data Structures and Algorithms)
*(Currently empty - planned for dedicated data structure and algorithm implementations outside of language-specific folders.)*

### 🗄️ Database
Comprehensive notes and guidelines on relational and non-relational database management systems:
- **NoSQL:** Conceptual files covering NoSQL structures and database categorisation (`NoSQL.txt`, `Types.txt`).
- **MongoDB:** Detailed subdirectories on MongoDB operations and utilities:
  - `Basics/` — Basic shell commands and syntax.
  - `Introduction/` — Document-oriented database concepts.
  - `CRUD-Operation/` — Creating, reading, updating, and deleting documents.
  - `Operators/` — Query, projection, logical, and element operators.
  - `Query-Operations/` — Advanced querying and filtering.
  - `Aggregation/` — Pipeline stages, expressions, and mapping.
  - `Indexing/` — Single-field, compound, multikey indexes, and query optimisation.
  - `Tools/` — MongoDB Compass, Shell, and Database Tools.

### 🎨 Frontend
A rich collection of frontend technologies and design patterns:
- **HTML:** Covers ARIA, Accessibility, Basic concepts, Forms-Tables, Projects, and Semantic HTML.
- **CSS:** Contains deep dives into styling rules, combinators, and responsive design across 17+ topics:
  - Subfolders: `Basic-CSS`, `Box-Model`, `Flexbox`, `Grid`, `Positioning`, `Relative-Absolute-Units`, `Responsive-Design`, `Typography`, `Colors`, `Variables`, `Animations`, `Attribute-Selectors`, `Pseudo-Classes-Elements`, `Design`, `Forms`, `Accessibility`, and `Practice`.
  - Also includes `DebugCSS.txt` for layout testing rules.
- **JS (JavaScript):** In-depth guides spanning 29 subfolders covering core and advanced execution contexts:
  - Fundamentals, Data Types, Objects, Arrays, Booleans-Numbers, Variables-Strings, Date Object, and Functions.
  - Advanced concepts: Scope/Closures, Asynchronous JS, Events, Classes/OOP, Functional Programming, Web APIs, DOM manipulation, storage-CRUD, dynamic programming, and graphs/trees.
- **React:** Detailed guides and resources on React development:
  - `Fundamentals/` — Components, JSX, and rendering lifecycle.
  - `State-Hooks-Routing/` — State hook patterns and basic navigation.
  - `Data-Fetching-Memoization/` — Using `useMemo`, `useCallback`, and fetching APIs.
  - `Effect-ReferencingValues/` — `useEffect` synchronisation and referencing values with `useRef`.
  - `Working-with-Data/` & `Working-with-Forms/` — Controlled/uncontrolled forms, validation, and data flows.
  - `Strategies_and_Debugging/` — Error boundaries, custom hooks, profiling, and debugging.
  - `Routing-Framework-DependencyTool/` — Client-side routing libraries, build tools, and frameworks.
- **Next:** Next.js basics and practical assignments:
  - `Basic.txt` — Covers Server-Side Rendering (SSR), Static Site Generation (SSG), routing, and api routes.
  - `Practice/` — Exercises and sample app pages.
- **TS (TypeScript):** Modern typed JavaScript concepts:
  - `types.ts` — Type definitions, interfaces, generics, and unions.

### ☕ Java
A collection of core Java programming exercises focusing on algorithms, math, and string manipulation:
- `CharacterFrequency.java`
- `Factorial.java`
- `MatrixAddition.java`
- `Palindrome.java`
- `ReverseString.java`
- `SecondLargestNum.java`
- `VowelsCounter.java`
- `Main.java`

### 🌐 Networking
Deep dive into networking layers, communication models, and protocols:
- **Computer-Networks:** `Basics.txt`, `Inter-Intra-Extra-Network.txt`, `Network-Devices.txt`, `Types-of-Network.txt`.
- **Network_models:** In-depth explanation of standard architectures:
  - Conceptual guides: `OSI-Model.txt`, `TCP-IP_Model.txt`.
  - Diagrams: `OSI-Model.gif` showing layer data encapsulation, and `working-of-tcp.webp` illustrating handshakes.
- **Physical-Layer:** Physical topologies and transmission media (`Phy-Topolgies.txt`, `Phy-ly.txt`, `Transmission-Modes.txt`).

### 🐍 Python
An extensive library of Python programming, algorithms, and projects:
- **Core Concepts:** Comprehensive files detailing Python syntax, variables, scopes, classes, OOP, list comprehensions, data structures (dictionaries, sets, queues, heaps), graphs, trees, error handling, filter/map/lambda functional modules, and GUI development.
- **Projects:** Algorithmic scripts and utility scripts under `Python/Projects/`:
  - *Sorting & Searching:* `MergeSort.py`, `QuickSort.py`, `SelectionSort.py`, `BinarySearch.py`, `BFS-Algo.py`, `DFS-Algo.py`.
  - *Mathematical & Algorithmic:* `BisectionMethod.py`, `Fibonacci.py`, `LuhnAlgo.py`, `N-Queen-Algo.py`, `Short-path-Algo.py` (Dijkstra), `PolygonArCalc.py`.
  - *Data & APIs:* `CountFrequency.py`, `AdjacencyList-MatrixConverter.py`, `Web_Scrapping.py`.
  - *Simulators:* `EmailSimulator.py`, `MediaCatalogue.py`, `DiscountCalculator.py`.
- **GUI:** Basic Python GUI components using `Python/GUI/main.py`.

---

## 🚀 Getting Started

To explore or run the resources in this repository:

1. **Conceptual Notes:** You can read the `.txt` explanation files directly in your IDE or terminal.
2. **Web Development:** Navigate to `Frontend/` and open individual project files, or run JavaScript samples using Node.js:
   ```bash
   node Frontend/JS/Asynchronous-JS/some-file.js
   ```
3. **Python Scripts:** Run any of the Python files using a standard Python 3.x interpreter:
   ```bash
   python Python/Projects/BFS-Algo.py
   ```
4. **Java Programs:** Compile and run the Java source files:
   ```bash
   javac Java/Palindrome.java
   java Java.Palindrome
   ```

Happy learning and coding!
